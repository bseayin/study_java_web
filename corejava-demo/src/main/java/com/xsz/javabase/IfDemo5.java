package com.xsz.javabase;

public class IfDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//课堂题目： 创建一个变量x,如果x是奇数就打印* ,如果是偶数就打印#
		int x=90;
		//解法1
		if(x%2==0){
			System.out.println("#");
		}
		
		if(x%2!=0){
			System.out.println("*");
		}
		//解法二
		if(x%2==0){
			System.out.println("#");
		}else{
			System.out.println("*");
		}
		//解法三
		if(x%2==0){
			System.out.println("#");
		}else if(x%2!=0){
			System.out.println("*");
		}
		
	}

}
