package com.xsz.javabase;

import com.xsz.object.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//һ����������Ҫִ�з�������Ҫ�ȴ�������
				//1 ����һ������
				Student st=new Student();
				//2�� ִ��set����
				st.setName("����");
				//3. ִ��get����
				String name=st.getName();
				System.out.println(name);
	}

}
