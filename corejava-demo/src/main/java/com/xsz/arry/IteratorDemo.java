package com.xsz.arry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        // ʹ�ö�̬��ʽ ��������
        Collection<String> coll = new ArrayList<String>();

        // ���Ԫ�ص�����
        coll.add("��������");
        coll.add("�²�����");
        coll.add("������");
        //����
        //ʹ�õ����� ����   ÿ�����϶������Լ��ĵ�����
        Iterator<String> it = coll.iterator();
        //  ����ָ���� ������ Ԫ�ص���������
        while(it.hasNext()){ //�ж��Ƿ��е���Ԫ��
            String s = it.next();//��ȡ��������Ԫ��
            System.out.println(s);
        }
        coll=(ArrayList)coll;
        System.out.println(((ArrayList<String>) coll).get(1));
    }
}
