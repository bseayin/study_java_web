package com.xsz.javabase;

public class ForDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//嵌套for循环
		//里面一共会打印10*5=50在控制台
		for(int i=0;i<10;i++){
			System.out.println("$");//10次
			for(int j=0;j<5;j++){
				System.out.println("i="+i+"***j="+j);//50次
			}
			
		}

	}

}
