package com.xsz.v2.basic.exception;

public class ExceptionDemo {

    public static void main(String[] args) throws Exception {

        try{
            a(8);

        }catch (Exception e){
           e.printStackTrace();
        }

        System.out.println("1");
        a(8);
        System.out.println("2");
    }

    private static void a(int i) throws Exception {
        if(i%2==0){
            throw new Exception("3");
        }
    }
}
