package com.xsz.api;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String ab;
        Random random=new Random();
        int a=random.nextInt();
        System.out.println("a="+a);
        int b=random.nextInt(10);
        System.out.println("b="+b);
    }
}
