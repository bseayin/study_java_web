package com.xsz.v2.basic.day4;

public class Test5 {
    public static void main(String[] args) {
         int a=9;
         //�൱�� a=a+1
//         a++;
//        ++a;
        // a++ �� ++a����a=a+1 �����Ժ�a�Ľ����һ���ġ�
//        System.out.println(a);

        int b;

//        b=a++;  //�ȸ�ֵ������
        b=++a; //�������ٸ�ֵ
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
