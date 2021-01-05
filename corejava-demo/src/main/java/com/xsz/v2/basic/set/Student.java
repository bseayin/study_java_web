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

	//�������û�з���ֵ������void
	public void setName(String iname){
		this.name=iname;
	}
	
	public String getName(){
		return this.name; 
	}
	
	public static void main(String[] args){
		//һ����������Ҫִ�з�������Ҫ�ȴ�������
		//1 ����һ������
		Student st=new Student();
		st.name="ss";
		//2�� ִ��set����
		st.setName("����");
		//3. ִ��get����
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
