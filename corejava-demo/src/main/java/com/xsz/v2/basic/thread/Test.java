package com.xsz.v2.basic.thread;

public class Test {
    public static void main(String[] args) {
        MyThread myThread=new MyThread("自定义线程1");
        //启动一个线程，执行Thread类的start方法
//        myThread.setName("自定义线程1");
        myThread.start();
        Thread2 thread2=new Thread2();
        thread2.setName("自定义线程2");
        thread2.start();

        //runable接口方式创建的线程启动方式
        MyRunnable myRunnable=new MyRunnable();
        Thread thread3=new Thread(myRunnable,"自定义线程3");
        thread3.start();

    }
}
