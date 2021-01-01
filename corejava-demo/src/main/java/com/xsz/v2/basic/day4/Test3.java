package com.xsz.v2.basic.day4;

public class Test3 {
    public static void main(String[] args) {
        //创建字符串对象
         String s = "aaybbycc";
         String[] strArray = s.split("y"); // ["aa","bb","cc"]
         for(int x = 0; x < strArray.length; x++)
         { System.out.println(strArray[x]);
//         aa bb cc
         }
    }
}
