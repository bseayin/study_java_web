package com.xsz.object;

public class Student {
	private String name;
	private  int age;
	
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

}
