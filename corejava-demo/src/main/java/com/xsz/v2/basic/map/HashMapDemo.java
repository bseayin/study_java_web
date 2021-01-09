package com.xsz.v2.basic.map;

import com.xsz.object.Student;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        /**
         * 创建一个对象，就是new 一次
         * 对象的名字是s1
         * 对象s1的数据类型是Student
         */
        Student s1=new Student();
        s1.setName("小明");
        s1.setAge(18);
        System.out.println("&*******************1");
        Student s2=new Student();
        s2.setName("小红");
        s2.setAge(28);
        System.out.println("&*******************2");
        HashMap<Student,String> map1=new HashMap<Student, String>();
        map1.put(s1,"上海");
        map1.put(s2,"海南");
        System.out.println("&*******************3");

    }
}
