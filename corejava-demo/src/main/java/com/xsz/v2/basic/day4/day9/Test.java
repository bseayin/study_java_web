package com.xsz.v2.basic.day4.day9;

public class Test {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.age=18;
        p1.name="小明";
        Person p2=new Person();
        p2.age=18;
        p2.name="小明";
        Person p3=p1;
//        p3.name="小红";
        System.out.println(p1.name);
        System.out.println(p1);
        System.out.println(p2);
        boolean flag=p1.equals(p2);
        boolean flag2=p1.equals(p3);
        System.out.println("比较结果："+flag);
    }
}
