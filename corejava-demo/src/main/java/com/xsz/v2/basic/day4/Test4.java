package com.xsz.v2.basic.day4;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        // 定义int 数组
         int[] arr = {2,34,35,4,657,8,69,9};
        // 打印数组,输出地址值
         System.out.println(arr);
        // [I@2ac1fdc4 // 数组内容转为字符串
         String s = Arrays.toString(arr);
        // 打印字符串,输出内容
         System.out.println(s);
        // [2, 34, 35, 4, 657, 8, 69, 9]
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
