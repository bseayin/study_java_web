package com.xsz.javabase;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//字符串String, 字符串的值，必须用双引号包起来
		String a="abcde";
		System.out.println(a);
		// length方法返回字符串的长度
		int b=a.length();
		System.out.println(b);
		
		String a1="ff";
		// int整数用加号，表示把两个值相加。 
		//String 字符串用加号，表示把两个字符串连接起来。
		String a2=a+a1;
		System.out.println(a2);
		//toUpperCase 字符串转大写
		String a3=a.toUpperCase();
		System.out.println(a3);
		
		//toLowerCase 字符串转小写
		String a4=a3.toLowerCase();
		System.out.println("小写*****"+a4);
		//字符串的下标是从0开始，也就是第一个位置的下标是0
		//如果不存在，indexOf会返回-1
		int b1=a.indexOf("y");
		System.out.println(b1);
		//如果是输入是一个子的字符串，那么下标返回子字符串的第一字母的下标
		int b2=a.indexOf("cde");
		System.out.println(b2);
		
		int b3=a.indexOf("dc");
		System.out.println(b3);
		//判断字符串以什么开头 startsWith
		boolean f1=a.startsWith("d");
		System.out.println("f1="+f1);
		
		boolean f2=a.startsWith("a");
		System.out.println("f2="+f2);
		
		// 判断两个int整数是否相等，用双等号 ==
		// 判断两个字符串是否相同,用equals方法
		int x=3;
		int y=5;
				
		boolean f3=3==5;
		
		String c1="abc";
		String c2="abc";
		
		boolean f4=c1.equals(c2);
		
		System.out.println("f3="+f3);
		System.out.println("f4="+f4);
		// 判断两个int整数是不相等，!=
		// 判断两个字符串不相同,用!equals方法
		
		boolean f5=3!=5;
		// 如果c1和c2字符串不相同，才会返回真（true）
		boolean f6=!c1.equals(c2);
		
		System.out.println("f5="+f5);
		System.out.println("f6="+f6);
		
		
		
	}

}
