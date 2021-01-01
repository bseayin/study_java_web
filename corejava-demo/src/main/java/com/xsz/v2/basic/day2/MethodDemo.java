package com.xsz.v2.basic.day2;
//方法：就是将一个功能抽取出来，把代码单独定义在一个大括号内，形成一个单独的功能。
//        当我们需要这个功能的时候，就可以去调用。这样即实现了代码的复用性，也解决了代码冗余的现象。

/**
 * 定义格式：
 * 修饰符 返回值类型 方法名 （参数列表）｛ 代码... return ; ｝
 */
public class MethodDemo {
    public static void main(String[] args) {
        //调用定义的方法method
          method(); //定义方法，被main方法调用
        a();
        operator();
    }
    public static void method() {
         System.out.println("自己定义的方法，需要被main调用运行");
     }

    public static void a() {
        System.out.println("自己定义的方法a，需要被main调用运行");
    }

    public static void b() {
        a();
        System.out.println("自己定义的方法a，需要被main调用运行");
    }

    //定义方法，方法中定义三元运算符
     public static void operator() {
         int i = 0; i = (1==2 ? 100:200);
         System.out.println(i);
         int j = 0 ; j = (3<=4 ? 500:600);
         System.out.println(j);
     }
}
