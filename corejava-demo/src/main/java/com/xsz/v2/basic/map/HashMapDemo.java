package com.xsz.v2.basic.map;

import com.xsz.object.Student;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        /**
         * ����һ�����󣬾���new һ��
         * �����������s1
         * ����s1������������Student
         */
        Student s1=new Student();
        s1.setName("С��");
        s1.setAge(18);
        System.out.println("&*******************1");
        Student s2=new Student();
        s2.setName("С��");
        s2.setAge(28);
        System.out.println("&*******************2");
        HashMap<Student,String> map1=new HashMap<Student, String>();
        map1.put(s1,"�Ϻ�");
        map1.put(s2,"����");
        System.out.println("&*******************3");

    }
}
