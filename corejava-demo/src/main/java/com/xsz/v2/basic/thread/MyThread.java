package com.xsz.v2.basic.thread;

public class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    public void run() {
        System.out.println("������߳��壬��������߳�Ҫ�ɵ����飬д��run��������");
        int a=0;
        while (++a<100){
            System.out.println(this.getName()+"�߳�1******"+a);
        }
    }

}
