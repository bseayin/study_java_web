package com.xsz.v2.basic.day1;

/**
 * 变量定义的格式包括三个要素： 数据类型 、 变量名 、 数据值 。
 * 格式练习定义所有基本数据类型的变量，
 * 代码如下： long类型：建议数据后加L表示。
 * float类型：建议数据后加F表示。
 * 5.4 注意事项 变量名称：在同一个大括号范围内，
 * 变量的名字不可以相同。
 * 变量赋值：定义的变量，不赋值不能使用。
 * 数据类型 变量名 = 数据值;
 * 变量定义的操作在方法里面叫局部变量，在方法外面定义的叫成员变量
 */
public class Variable {


    public static void main(String[] args) {
        //定义字节型变量
        byte b = 100;  //包含两个操作：1，定义， 2，赋值  注意：一个变量有且只有一次定义，但是可以多次赋值
        b=120; //第二次赋值，把值改变了
        System.out.println(b);
        //定义短整型变量
        short s = 1000;
        System.out.println(s);
        //定义整型变量
         int i = 123456;
         System.out.println(i);
         //定义长整型变量
        long l = 12345678900L;
        System.out.println(l);
        //定义单精度浮点型变量
        float f = 5.5F;
        System.out.println(f);
        //定义双精度浮点型变量
         double d = 8.5;
         System.out.println(d);
         //定义布尔型变量
        boolean bool = false;
        System.out.println(bool);
//         定义字符型变量
        char c = 'A';
        System.out.println(c);
        //    变量赋值：定义的变量，不赋值不能使用。
        //只是定义了变量c1,没有赋值
        char c1;
//        System.out.println(c1);
    }

}
