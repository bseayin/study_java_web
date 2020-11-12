package com.xsz.javabase;

public class ForDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("你好");
		System.out.println("中国");
		System.out.print("长城");
		System.out.print(",故宫");
		System.out.println("***********************");
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print("$");
			}
			System.out.println("");
		}
		System.out.println("*********打印三角形**************");
		
		for(int i=1;i<=5;i++){
            for(int j=5; i<=j; j--)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print("*");
            for(int j=1; j<i; j++)
                System.out.print("*");
            System.out.println();
        }
		
	}

}
