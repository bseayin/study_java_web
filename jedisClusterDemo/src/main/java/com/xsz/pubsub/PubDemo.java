package com.xsz.pubsub;

import redis.clients.jedis.Jedis;

public class PubDemo {
    public Long publish(){
        System.out.println("发布者 ");
        Long res = null;
        try {
            Jedis jr = new Jedis("127.0.0.1", 6379, 0);// redis服务地址和端口号
            // jr客户端配置监听两个channel
            new Thread(()->{
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                jr.publish("mychannel", "test");
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
