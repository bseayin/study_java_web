package com.xsz.arry;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1Collection {
    public static void main(String[] args) {
        // �������϶���
        // ʹ�ö�̬��ʽ
        // ʹ�÷��� �̶��˼��ϵ�Ԫ�����ͣ�ֻ�ܴ�String
        Collection<String> coll = new ArrayList<String>();
        // ʹ�÷���
        // ��ӹ���  boolean  add(String s)
        coll.add("С���");
        coll.add("ɨ��ɮ");
        coll.add("ʯ����");
        System.out.println(coll);

        // boolean contains(E e) �ж�o�Ƿ��ڼ����д���
        System.out.println("�ж�  ɨ��ɮ �Ƿ��ڼ�����"+coll.contains("ɨ��ɮ"));

        //boolean remove(E e) ɾ���ڼ����е�oԪ��
        System.out.println("ɾ��ʯ���죺"+coll.remove("ʯ����"));
        System.out.println("����֮�󼯺���Ԫ��:"+coll);

        // size() �������м���Ԫ��
        System.out.println("��������"+coll.size()+"��Ԫ��");

        // Object[] toArray()ת����һ��Object����
        Object[] objects = coll.toArray();
        // ��������
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        // void  clear() ��ռ���
        coll.clear();
        System.out.println("����������Ϊ��"+coll);
        // boolean  isEmpty()  �ж��Ƿ�Ϊ��
        System.out.println(coll.isEmpty());
    }
}
