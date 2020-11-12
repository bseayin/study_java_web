package com.xsz.javabase;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for循环，10到19
		//结束不了的循环叫死循环
		for(int i=10;i<20;i++){
			System.out.println(i);
		}
		System.out.println("*************while*****************");
		//while循环
		int j=10;
		while(j<20){
			System.out.println(j);
			j++;
		}
		System.out.println("*************do while*****************");
		int a=10;
		do{
			System.out.println(a);
			a++;
		}while(a<20);
		
		/**
		 * do while和while的区别：do while可以保证至少执行一次。
		 */
		
	}

}
