package com.xsz.javabase;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个 ArrayList 一种集合
		ArrayList list1=new ArrayList();
		list1.add("中国");
		list1.add(120);
		list1.add("ssss");
		
		//遍历list
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
		
		

	}

}
