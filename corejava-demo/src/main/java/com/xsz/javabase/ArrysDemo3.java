package com.xsz.javabase;

public class ArrysDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] b1=new String[5];
		b1[0]="ab";
		b1[1]="123";
		b1[2]="钉钉";
		b1[3]="qq";
		b1[4]="微信";
		//课堂练习： 倒着打印数组里面的值
		//解法1
		for(int i=b1.length-1;i>=0;i--){
			System.out.println(b1[i]);
		}
		System.out.println("******************");
		//解法2
		for(int i=b1.length;i>0;i--){
			System.out.println(b1[i-1]);
		}
		
	}

}
