package com.xsz.arry;

public class NBForDemo1 {
    public static void main(String[] args) {
        int[] arr = {3,5,6,87};
        //使用增强for遍历数组
        // for each 循环
        for(int a : arr){//a代表数组中的每个元素 相当于arr[i]
            System.out.println(a);
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
