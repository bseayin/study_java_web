package com.xsz.v2.basic.day4;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        // ����int ����
         int[] arr = {2,34,35,4,657,8,69,9};
        // ��ӡ����,�����ֵַ
         System.out.println(arr);
        // [I@2ac1fdc4 // ��������תΪ�ַ���
         String s = Arrays.toString(arr);
        // ��ӡ�ַ���,�������
         System.out.println(s);
        // [2, 34, 35, 4, 657, 8, 69, 9]
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
