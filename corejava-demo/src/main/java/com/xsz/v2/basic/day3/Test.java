package com.xsz.v2.basic.day3;

public class Test {
    public static void main(String[] args) {
        int[] a={1,2,4};
        int[] b=a;
        b[1]=9;
        System.out.println(a[1]);
        int a1=12;
        int b1=a1;
        b1=88;
        System.out.println(a1);
    }


}
