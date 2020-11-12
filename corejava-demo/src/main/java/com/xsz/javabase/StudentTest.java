package com.xsz.javabase;

import com.xsz.object.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//一般情况，如果要执行方法，需要先创建对象
				//1 创建一个对象
				Student st=new Student();
				//2， 执行set方法
				st.setName("张三");
				//3. 执行get方法
				String name=st.getName();
				System.out.println(name);
	}

}
