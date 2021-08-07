package com.xsz.designpattern.signleton;

public class Test {
    public static void main(String[] args) {
//        SignletonDemo s1 =new SignletonDemo();
//        SignletonDemo s2 =new SignletonDemo();
//        SignletonDemo s3 =new SignletonDemo();
        SignletonDemo s1= SignletonDemo.getInstance();
        SignletonDemo s2= SignletonDemo.getInstance();
        SignletonDemo s3= SignletonDemo.getInstance();
        System.out.println(s1.equals(s2));
    }
}
