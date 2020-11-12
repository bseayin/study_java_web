package com.xsz.object;

public class Student {
	private String name;
	private  int age;
	
	//如果方法没有返回值，就用void
	public void setName(String iname){
		this.name=iname;
	}
	
	public String getName(){
		return this.name; 
	}
	
	public static void main(String[] args){
		//一般情况，如果要执行方法，需要先创建对象
		//1 创建一个对象
		Student st=new Student();
		st.name="ss";
		//2， 执行set方法
		st.setName("张三");
		//3. 执行get方法
		String name=st.getName();
		System.out.println(name);
	}

}
