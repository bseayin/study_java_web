package com.xsz.v2.basic.day4;

public class Test3 {
    public static void main(String[] args) {
        //�����ַ�������
         String s = "aaybbycc";
         String[] strArray = s.split("y"); // ["aa","bb","cc"]
         for(int x = 0; x < strArray.length; x++)
         { System.out.println(strArray[x]);
//         aa bb cc
         }
    }
}
