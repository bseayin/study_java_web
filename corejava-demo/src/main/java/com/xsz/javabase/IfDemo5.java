package com.xsz.javabase;

public class IfDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������Ŀ�� ����һ������x,���x�������ʹ�ӡ* ,�����ż���ʹ�ӡ#
		int x=90;
		//�ⷨ1
		if(x%2==0){
			System.out.println("#");
		}
		
		if(x%2!=0){
			System.out.println("*");
		}
		//�ⷨ��
		if(x%2==0){
			System.out.println("#");
		}else{
			System.out.println("*");
		}
		//�ⷨ��
		if(x%2==0){
			System.out.println("#");
		}else if(x%2!=0){
			System.out.println("*");
		}
		
	}

}
