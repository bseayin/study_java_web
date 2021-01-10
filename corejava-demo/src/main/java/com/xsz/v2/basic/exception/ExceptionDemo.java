package com.xsz.v2.basic.exception;

public class ExceptionDemo {

    public static void main(String[] args) throws Exception {
        /**
         * 处理异常用两种方式
         * 1. 在方法的签名上，直接抛出throws Exception，意思就是自己不处理，让调用这个方法的地方处理
         * 2. 通过try catch处理异常
         */
        try{
            a(8);

        }catch (Exception e){
           e.printStackTrace();
        }

        System.out.println("1遇到异常以后");
        a(8);
        System.out.println("2遇到异常以后");
    }

    private static void a(int i) throws Exception {
        if(i%2==0){
            throw new Exception("我不要偶数");
        }
    }
}
