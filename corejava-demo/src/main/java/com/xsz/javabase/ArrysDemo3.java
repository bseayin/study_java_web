package com.xsz.javabase;

public class ArrysDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] b1=new String[5];
		b1[0]="ab";
		b1[1]="123";
		b1[2]="����";
		b1[3]="qq";
		b1[4]="΢��";
		//������ϰ�� ���Ŵ�ӡ���������ֵ
		//�ⷨ1
		for(int i=b1.length-1;i>=0;i--){
			System.out.println(b1[i]);
		}
		System.out.println("******************");
		//�ⷨ2
		for(int i=b1.length;i>0;i--){
			System.out.println(b1[i-1]);
		}
		
	}

}
