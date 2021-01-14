package com.xsz.thread;

import lombok.SneakyThrows;

import java.util.Objects;

public class Ticket implements Runnable{
    //成员变量 全局变量
     int ticketnum=100;
     Object lock=new Object();
    @SneakyThrows
    @Override
    public void run() {

        while (true){
            synchronized (lock) {
                if (ticketnum > 0) {
                    Thread.sleep(100);
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖" + ticketnum--);
                }
            }
        }
    }
}
