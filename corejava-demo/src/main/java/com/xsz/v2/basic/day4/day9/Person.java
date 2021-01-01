package com.xsz.v2.basic.day4.day9;



public class Person {
     String name;
     int age;

    @Override
    public boolean equals(Object o) {
        // ��������ַһ��������Ϊ��ͬ
        if (this == o)
            return true;
        // �������Ϊ�գ�����������Ϣ��һ��������Ϊ��ͬ
        if (o == null || getClass() != o.getClass())
            return false;
        // ת��Ϊ��ǰ����
        Person person = (Person) o;
        // Ҫ�����������ȣ����ҽ��������ͽ���java.util.Objects���equals��̬����ȡ�ý��
        return age == person.age && name.equals(person.name);
    }
}
