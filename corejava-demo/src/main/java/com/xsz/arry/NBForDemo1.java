package com.xsz.arry;

public class NBForDemo1 {
    public static void main(String[] args) {
        int[] arr = {3,5,6,87};
        //ʹ����ǿfor��������
        // for each ѭ��
        for(int a : arr){//a���������е�ÿ��Ԫ�� �൱��arr[i]
            System.out.println(a);
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
