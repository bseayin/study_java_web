package com.xsz.v2.basic.thread;

public class Test {
    public static void main(String[] args) {
        MyThread myThread=new MyThread("�Զ����߳�1");
        //����һ���̣߳�ִ��Thread���start����
//        myThread.setName("�Զ����߳�1");
        myThread.start();
        Thread2 thread2=new Thread2();
        thread2.setName("�Զ����߳�2");
        thread2.start();

        //runable�ӿڷ�ʽ�������߳�������ʽ
        MyRunnable myRunnable=new MyRunnable();
        Thread thread3=new Thread(myRunnable,"�Զ����߳�3");
        thread3.start();

    }
}
