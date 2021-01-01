package com.xsz.v2.basic.day4;

public class Test {
    public static void main(String[] args) {
        byte bytes[] = { 97, 98, 99 };
        String str3 = new String(bytes);
        System.out.println(str3);

        String s1="abcdefad";
        int a1=s1.indexOf("e");
        System.out.println(a1);
        String s2="A2342424";
        String s3=s2.substring(1);
        System.out.println(s3);
    }
}
