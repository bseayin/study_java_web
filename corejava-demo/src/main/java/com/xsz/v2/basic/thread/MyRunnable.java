package com.xsz.v2.basic.thread;

public class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()+"第二种创建线程的方式");
    }
}
