package com.xsz.pubsub;

public class SubScribeRedis extends SubDemo {
    @Override
    public String getChannel() {
        return "mychannel";
    }

    @Override
    public boolean dealMessage(String message) {
        System.out.println("--------"+message);
        return false;
    }
}
