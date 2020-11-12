package com.xsz.javabase;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个对象  ， new是关键字，后面跟的是构造方法
		
		Employee  e1=new Employee("张三",8888.98);
		
		double s1=e1.getSalary();
		System.out.println(s1);
		

	}

}
