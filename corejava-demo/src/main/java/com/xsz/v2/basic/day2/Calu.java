package com.xsz.v2.basic.day2;
//赋值运算符，就是将符号右边的值，赋给左边的变量。
public class Calu {
    public static void main(String[] args){
        int i = 5;
        i+=5;
        //计算方式 i=i+5 变量i先加5，再赋值变量i
         System.out.println(i);
        // 输出结果是10
//        比较运算符
        System.out.println(1==1);
       System.out.println(1<2);
        System.out.println(3>4);
         System.out.println(3<=4);
        System.out.println(3>=4);
         System.out.println(3!=4);
//        逻辑运算符

        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false，右边不计算
        System.out.println(false || false);//falase
        System.out.println(false || true);//true
        System.out.println(true || false);//true，右边不计算
        System.out.println(!false);//true
//        三元运算符
//        三元运算符格式： 数据类型 变量名 = 布尔类型表达式？结果1：结果2
//        三元运算符计算方式： 布尔类型表达式结果是true，
//        三元运算符整体结果为结果1，赋值给变量。
//        布尔类型表达式结果是false，
//        三元运算符整体结果为结果2，赋值给变量。

            int a = (1==2 ? 100 : 200);
            System.out.println(a);//200
             int j = (3<=4 ? 500 : 600);
             System.out.println(j);//500
         }



}
