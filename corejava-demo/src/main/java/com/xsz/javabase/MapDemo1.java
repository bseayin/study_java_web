package com.xsz.javabase;

import java.util.HashMap;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��Ҫ����
		// ������һ��hashmap���󣬶����������map,��������ֿ����Լ�����
		HashMap map=new HashMap();
		//��ֵ  key, value�ĸ�ʽ
		map.put("name", "����");
		map.put("age", 18);
		map.put("sex", "��");
		//ȡֵ
		String t1=(String) map.get("name");
		System.out.println(t1);
		String sss=(String) map.get("age");
		System.out.println(sss);
		
		
		

	}

}
