package com.xsz.arry;

import com.xsz.object.Student;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        /**
         * 定义一个数组的格式：
         *  类型[] 数组的名字=new 类型[数组的长度]
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
        // ArrayList的add方法输入参数类型是Object,所以可以接受使用的引用类型
        // s1是int类型，属于基本类型，但是可以自动装箱变成包装类型，包装类型也是引用类型
        d.add(s1);
        d.add(s2);
        d.add(student);
        d.add(a);
        d.add(b);
        d.add(c);


    }
}
