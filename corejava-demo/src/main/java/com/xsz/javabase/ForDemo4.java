package com.xsz.javabase;

public class ForDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���");
		System.out.println("�й�");
		System.out.print("����");
		System.out.print(",�ʹ�");
		System.out.println("***********************");
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print("$");
			}
			System.out.println("");
		}
		System.out.println("*********��ӡ������**************");
		
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
