package com.xsz.javabase;

public class ForDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//最外层的i控制了图像的行数
		for(int i=1;i<=5;i++){
            for(int j=5; i<=j; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }   
            for(int j=1; j<i; j++){
                System.out.print("*");
            } 
            //System.out.print 不会换行
            //System.out.println 会导致后面的内容换行
            System.out.println();
        }
	}

}
