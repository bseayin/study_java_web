package com.xsz.v2.basic.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        //添加元素
         set.add(new String("cba"));
         set.add("1abc");
         set.add("2bac");
         set.add("3bac");
         set.add("4cba");
//         遍历
         for (String name : set)
         {
         System.out.println(name);
         }
        HashSet<Student> set2 = new HashSet<Student>();
         Student student=new Student();
         student.setAge(18);
         student.setName("jerry");
         student.setSex("boy");
        Student student2=new Student();
        student2.setAge(18);
        student2.setName("jerry");
        student2.setSex("girl");
        boolean flag=student.equals(student2);
        System.out.println(flag);
        set2.add(student);
        set2.add(student2);
        System.out.println(set2);

    }
}
