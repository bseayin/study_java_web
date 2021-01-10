package com.xsz.v2.basic.thread;

public class Thread2 extends Thread{
    public void run() {

        int a=0;
        while (++a<100){
            System.out.println(this.getName()+"Ïß³Ì2******"+a);
        }
    }

}
