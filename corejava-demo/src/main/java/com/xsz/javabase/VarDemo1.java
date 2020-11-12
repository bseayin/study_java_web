package com.xsz.javabase;
// class 后面的表示类的名字
public class VarDemo1 {
	// 不在方法里面定义的变量叫全局变量
	int dd=9;
	// 方法的格式:  修饰符  方法的名字(){}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarDemo1 v1=new VarDemo1();
		v1.test1();
		// 变量： 类型  变量名字=值
		int a=v1.test2();
		System.out.println(a);
		int b=v1.add(61,8);
		System.out.println(b);
	}
	

	/**
	 * 多行注解
	 * void 表示这个方法没有返回值
	 * test1 表示方法的名字
	 * {方法体}
	 */
	void test1(){
		// 方法里面定义的变量叫局部变量
		int d=9;
		System.out.println(d);
		System.out.println(dd);
		System.out.println("这里表示test1方法被执行了");
	}
	
	/**
	 * int表示方法的返回值类型是8
	 * @return
	 */
	int test2(){
		System.out.println(dd);
		System.out.println("这里表示test2方法被执行了");
		return 8;
	}
	/**
	 * int表示方法的返回值类型是整数
	 * (int a, int b) 表示输入参数，有两个，两个数据类型是int整数
	 * @return
	 */
	int add(int a, int b){
		return a+b;
	}

}
