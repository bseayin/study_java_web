package com.xsz.v2.basic.day2;
//自动转换：将 取值范围小的类型 自动提升为 取值范围大的类型 。
//转换规则 范围小的类型向范围大的类型提升， byte、short、char 运算时直接提升为 int 。
//byte、short、char‐‐>int‐‐>long‐‐>float‐‐>double
public class DataType {
    public static void main(String[] args) {
        int i = 1;
        byte b = 2;
//         byte x = b + i;
        // 报错 //int类型和byte类型运算，结果是int类型
        int j = b + i;
        System.out.println(j);


         double d = 2.5;
         //int类型和double类型运算，结果是double类型 //int类型会提升为double类型
        double e = d+i;
        System.out.println(e);
    }
}
