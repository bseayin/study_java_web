package com.xsz.javabase;

public class ArrysDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ���������͵�����,�����ʾ������һ��������3���������顣
		int[] a1=new int[3];
		//������a1�ĵ�һ��λ�÷���һ��8
		a1[0]=8;
		//������a1�ĵڶ���λ�÷���һ��17
		a1[1]=17;
		a1[2]=87;
		//������a1���±���1��λ�õ�ֵȡ��������ֵ��y
		int y=a1[1];
		System.out.println(y);
		
		//����һ���ַ������͵�����
		String[] b1=new String[5];
		b1[0]="ab";
		b1[1]="123";
		b1[2]="����";
		b1[3]="qq";
		b1[4]="΢��";
		
		//������b1���±���3��λ�õ�ֵȡ��������ֵ��y
		String x=b1[3];
		System.out.println(x);
		
		int b2=b1.length;
		System.out.println(b2);
		
	}

}
