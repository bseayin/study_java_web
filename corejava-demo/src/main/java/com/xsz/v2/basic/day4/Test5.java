package com.xsz.v2.basic.day4;

public class Test5 {
    public static void main(String[] args) {
         int a=9;
         //相当于 a=a+1
//         a++;
//        ++a;
        // a++ 和 ++a都是a=a+1 计算以后a的结果是一样的。
//        System.out.println(a);

        int b;

//        b=a++;  //先赋值再自增
        b=++a; //先自增再赋值
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
