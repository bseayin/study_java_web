package com.xsz.javabase;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ�� ArrayList һ�ּ���
		ArrayList list1=new ArrayList();
		list1.add("�й�");
		list1.add(120);
		list1.add("ssss");
		
		//����list
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
		
		

	}

}
