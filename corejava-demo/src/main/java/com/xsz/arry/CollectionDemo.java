package com.xsz.arry;

import com.xsz.object.Student;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        /**
         * ����һ������ĸ�ʽ��
         *  ����[] ���������=new ����[����ĳ���]
         *
         */
        int[] a=new int[3];
        String[] b=new String[7];
        Student[] c=new Student[11];

        int s1=12;
        String s2="2343fdf";
        Student student=new Student();
        a[0]=s1;
        b[0]=s2;
        c[0]=student;


        ArrayList d=new ArrayList();
        // ArrayList��add�����������������Object,���Կ��Խ���ʹ�õ���������
        // s1��int���ͣ����ڻ������ͣ����ǿ����Զ�װ���ɰ�װ���ͣ���װ����Ҳ����������
        d.add(s1);
        d.add(s2);
        d.add(student);
        d.add(a);
        d.add(b);
        d.add(c);


    }
}
