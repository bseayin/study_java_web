package com.xsz.pubsub;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(1000);
        config.setMaxIdle(300);
        config.setMaxWaitMillis(1000);
        JedisPool jedisPool = new JedisPool(config, "localhost", 6379);

        // 会阻塞,所以使用线程打开
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Jedis jedis = jedisPool.getResource();
                ChannelListener c=	new ChannelListener();
                try {
                    System.out.println("打开订阅线程,执行下句代码后此线程会阻塞");
                    jedis.subscribe(c, "test");
                    System.out.println("关闭订阅时才会打印");
                } finally {
                    // TODO: handle finally clause
                    System.out.println("线程关闭");
                    //取消订阅
                    jedis.close();
                }

            }
        });
        service.execute(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Jedis jedis = jedisPool.getResource();
                try {
                    // 每秒发送一条消息到对应主题
                    for (int i = 0; i < 10; i++) {
                        jedis.publish("test", String.valueOf(i));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }

                } finally {
                    // TODO: handle finally clause
                    System.out.println("关闭连接");
                    jedis.close();
                }

            }
        });
        try {
            Thread.sleep(11000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // 关闭线程,即使你换成now来强制关闭,如果没有下面的通知订阅关闭代码,jvm是无法关闭的
        service.shutdown();
        //通知订阅关闭
        jedisPool.getResource().publish("test", "close");
        // 关闭线程池
        jedisPool.close();
    }
}
