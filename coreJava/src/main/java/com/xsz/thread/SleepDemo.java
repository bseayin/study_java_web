package com.xsz.thread;

import lombok.SneakyThrows;

public class SleepDemo extends Thread {
    @SneakyThrows
    public void run(){
        System.out.println("倒计时10秒开始");
        for(int i=0;i<10;i++){

            Thread.sleep(1000);
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        SleepDemo sleepDemo=new SleepDemo();
        sleepDemo.start();
    }
}
