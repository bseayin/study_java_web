package com.xsz.javabase;

public class ForDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++){
            
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
