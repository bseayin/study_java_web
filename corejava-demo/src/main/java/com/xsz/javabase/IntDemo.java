package com.xsz.javabase;

public class IntDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int 表示整数
		 * 所有的标识符都应该以字母（A-Z 或者 a-z）,美元符（$）、或者下划线（_）开始
		 */
		int a=12;
		int b=6;
		//加法
		int c=a+b;
		//减法
	    int g=a-b;
		//乘法
		int d=a*b;
		//除法
		int h=a/b;
		System.out.println(c);
		System.out.println(g);
		System.out.println(d);
		System.out.println(h);
		
		int ab=8;
		System.out.println(ab);
		//表示自增运算 相当于 ab=ab+1;
		ab++;
		System.out.println(ab);
		
		int ac=6;
		ac--;
		System.out.println(ac);
		ac--;
		System.out.println(ac);
		
		int ad=8;
		int ah=5;
		// % 表示 获取 余数
		int add=ad%ah;
		System.out.println(add);
		int hh=88;
		// 判断一个整数是奇数 还是偶数，可以通过对2取余，如果取余结果是0 表示偶数，否则是奇数。
		int hd=hh%2;
		System.out.println(hd);
		
	}

}
