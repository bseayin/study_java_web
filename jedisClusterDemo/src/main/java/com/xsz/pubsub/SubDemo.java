package com.xsz.pubsub;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

import javax.annotation.PostConstruct;

public abstract  class SubDemo extends JedisPubSub {

    public abstract String getChannel();

    public abstract boolean dealMessage(String message);

    public void onMessage(String channel, String message) {
        dealMessage(message);
    }

    @PostConstruct
    public void init(){
        System.out.println("订阅者 ");
        Jedis jr = null;
        try {
            jr = new Jedis("127.0.0.1", 6379, 0);// redis服务地址和端口号
            // jr客户端配置监听两个channel
            jr.subscribe(this, "mychannel");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jr != null) {
                jr.disconnect();
            }
        }
    }
}