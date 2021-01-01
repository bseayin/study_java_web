package com.xsz.v2.basic.day3;

public class OverloadDemo {
    public static void open(){} ;
    public static void open(int a){};
//    static void open(int a,int b){} ;
    public static void open(double a,int b){} ;
//    public static void open(int a,double b){} ;
    public void open(int i,double d){};
    public static void OPEN(){} ;
    public static void open(int i,int j){};
}
