package com.xsz.javabase;

import java.util.HashMap;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//需要导包
		// 创建了一个hashmap对象，对象的名字是map,对象的名字可以自己定义
		HashMap map=new HashMap();
		//存值  key, value的格式
		map.put("name", "张三");
		map.put("age", 18);
		map.put("sex", "男");
		//取值
		String t1=(String) map.get("name");
		System.out.println(t1);
		String sss=(String) map.get("age");
		System.out.println(sss);
		
		
		

	}

}
