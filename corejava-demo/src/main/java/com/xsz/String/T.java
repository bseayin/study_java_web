package com.xsz.String;

public class T {
    public static void main(String[] args) {
        String a="12";
        // string 转 int 通过Integer.parseInt
        //String 转基本类型，一般都是通过对应的包装类的parse*方法
        int c=Integer.parseInt(a);
        test(c);
        int b=88;
        // 基本类型转String ， 基本类型的值+“”
        String s=b+"";
        test1(s);

    }

    public static void test (int b){
        System.out.println(b);
    }

    public static void test1 (String b){
        System.out.println(b);
    }
}
