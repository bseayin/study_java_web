package com.xsz.javabase;

public class ArrysDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个整数类型的数组,下面表示创建了一个长度是3的整数数组。
		int[] a1=new int[3];
		//在数组a1的第一个位置放了一个8
		a1[0]=8;
		//在数组a1的第二个位置放了一个17
		a1[1]=17;
		a1[2]=87;
		//把数组a1的下标是1的位置的值取出来，赋值给y
		int y=a1[1];
		System.out.println(y);
		
		//创建一个字符串类型的数组
		String[] b1=new String[5];
		b1[0]="ab";
		b1[1]="123";
		b1[2]="钉钉";
		b1[3]="qq";
		b1[4]="微信";
		
		//把数组b1的下标是3的位置的值取出来，赋值给y
		String x=b1[3];
		System.out.println(x);
		
		int b2=b1.length;
		System.out.println(b2);
		
	}

}
