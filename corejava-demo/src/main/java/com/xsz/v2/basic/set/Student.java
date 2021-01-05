package com.xsz.v2.basic.set;

import java.util.Objects;

public class Student {
	private String name;
	private String sex;
	private  int age;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

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


	public boolean equals(Object anObject) {
		if (this == anObject) {
			return true;
		}
		if (anObject instanceof Student) {
			Student another = (Student)anObject;
			if(another.age==this.age&&another.name.equals(this.name)){
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		int hashcode1=this.name.hashCode();
		return age+hashcode1;
	}

	public String toString() {
		return this.name+"**age**"+this.age+"****sex**"+this.sex;
	}

}
