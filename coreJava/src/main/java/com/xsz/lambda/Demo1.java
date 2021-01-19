package com.xsz.lambda;

public class Demo1 {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("lambmda 实现的runnable接口的 run方法被执行了")).start();

        new Thread(()-> {
            System.out.println("我要一个教练");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("教练来了："+Thread.currentThread().getName());
            System.out.println("教我游泳,交完后，教练回到了游泳池");

             }).start();
    }
}
