package com.xsz.arry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add("itcast");
        coll.add(5);//���ڼ���û�����κ��޶����κ����Ͷ����Ը����д��
        coll.add(false);

        Iterator it = coll.iterator();
        while(it.hasNext()){
            //��Ҫ��ӡÿ���ַ����ĳ���,��Ҫ�ѵ��������Ķ���ת��String����
            String str = (String) it.next();
            System.out.println(str.length());
        }
    }

}
