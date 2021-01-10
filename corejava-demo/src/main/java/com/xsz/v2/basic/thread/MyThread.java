package com.xsz.v2.basic.thread;

public class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    public void run() {
        System.out.println("这个是线程体，就是这个线程要干的事情，写在run方法这里");
        int a=0;
        while (++a<100){
            System.out.println(this.getName()+"线程1******"+a);
        }
    }

}
