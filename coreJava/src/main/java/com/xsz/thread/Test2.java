package com.xsz.thread;

public class Test2 {
    int a=99;

    public static void main(String[] args) {
        Test2 t1=new Test2();
        Test2 t2=new Test2();
        t1.a=88;
        System.out.println(t1.a);//88
        System.out.println(t2.a);//99
        change(t1);
        System.out.println(t1.a);//66
        System.out.println(t2.a);//99
    }

    public static void change(Test2 test2){
        test2.a=66;
    }
}
