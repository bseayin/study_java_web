package com.xsz.javabase;

public class ArraysDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1=new int[3];
		//在数组a1的第一个位置放了一个8
		a1[0]=118;
		//在数组a1的第二个位置放了一个17
		a1[1]=99;
		a1[2]=87;
		
		//计算所有元素的总和
		int t=0;
		for(int i=0;i<a1.length;i++){
			t=t+a1[i];
		}
		System.out.println("所有元素总和="+t);
		
		//找出数组中最大的元素
		int max=0;
		for(int i=0;i<a1.length;i++){
			if(a1[i]>max){
				//等于号是赋值运算，永远都是把右边的值， 赋值给左边变量
				max=a1[i];
			}
		}
		System.out.println("最大值="+max);
		
		
		
	}

}
