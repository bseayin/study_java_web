package com.xsz.v2.basic.day4;

public class Test7 {
    public static void main(String[] args) {
        /**
         * 数学里面 四舍五入是不看负号的。
         * Math.round方法里面是每次都自动+0.5 然后向下取整。
         * 所以Math.round(-1.5)结果是-1， Math.round(-1.6)结果是-2
         */
        long d1 = Math.round(-1.5); //结果是 -1
        long d2 = Math.round(-1.6); //结果是 -2
        long d3 = Math.round(-2.5); //结果是 -2
        long d4 = Math.round(2.5); //结果是 3

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);


    }
}
