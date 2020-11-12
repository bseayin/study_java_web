package com.xsz.javabase;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//布尔类型boolean true表示真， false表示假
		boolean f=true;
		boolean f1=false;
				
				
		//if的格式： if（真假表达式）   {只有小括号里面的是真的，才会执行这个大括号里面的东西}
		if(2>3){
			System.out.println("真的1");
		}
		
		if(2<3){
			System.out.println("真的2");
		}
		//判断等于用 ==
		if(3==3){
			System.out.println("真的3");
		}
		
		//判断不等于用 !=
		if(3!=3){
			System.out.println("真的4");
		}
	}

}
