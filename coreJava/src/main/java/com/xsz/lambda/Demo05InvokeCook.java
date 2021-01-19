package com.xsz.lambda;

public class Demo05InvokeCook {
    public static void main(String[] args) {
        // TODO 请在此使用Lambda【标准格式】调用invokeCook方法
        /**
         * invokeCook(lambda 表达式)
         * 参考 ： new Thread(()-> System.out.println("lambmda 实现的runnable接口的 run方法被执行了"))
         */
        invokeCook(()-> System.out.println("lambda 表达式课堂练习"));
    }

    public static  void invokeCook(Cook cook){
        cook.makeFood();
    }
}
