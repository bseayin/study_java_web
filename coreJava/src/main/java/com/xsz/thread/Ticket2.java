package com.xsz.thread;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket2 implements Runnable{
    //成员变量 全局变量
     int ticketnum=100;
    Lock lock=new ReentrantLock();
    @SneakyThrows
    @Override
    public void run() {

        while (true){
                lock.lock();
                if (ticketnum > 0) {
                    Thread.sleep(100);
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖" + ticketnum--);
                }
                lock.unlock();
            }
        }
    }

