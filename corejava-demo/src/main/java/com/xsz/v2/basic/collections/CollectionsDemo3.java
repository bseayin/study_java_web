package com.xsz.v2.basic.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ԭ��д��
        // list.add(12); //list.add(14); //list.add(15); //list.add(1000);
        // ���ù����� ��� �����������Ԫ��
         Collections.addAll(list, 5, 222, 1,2,8,9,2322,4535);
         System.out.println(list);
        // ���򷽷�
         Collections.sort(list);
         System.out.println(list);
    }
}
