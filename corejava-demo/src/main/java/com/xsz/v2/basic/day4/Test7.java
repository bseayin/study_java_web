package com.xsz.v2.basic.day4;

public class Test7 {
    public static void main(String[] args) {
        /**
         * ��ѧ���� ���������ǲ������ŵġ�
         * Math.round����������ÿ�ζ��Զ�+0.5 Ȼ������ȡ����
         * ����Math.round(-1.5)�����-1�� Math.round(-1.6)�����-2
         */
        long d1 = Math.round(-1.5); //����� -1
        long d2 = Math.round(-1.6); //����� -2
        long d3 = Math.round(-2.5); //����� -2
        long d4 = Math.round(2.5); //����� 3

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);


    }
}
