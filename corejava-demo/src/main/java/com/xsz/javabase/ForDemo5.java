package com.xsz.javabase;

public class ForDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������i������ͼ�������
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
            //System.out.print ���ỻ��
            //System.out.println �ᵼ�º�������ݻ���
            System.out.println();
        }
	}

}
