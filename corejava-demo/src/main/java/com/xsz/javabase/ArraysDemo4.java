package com.xsz.javabase;

public class ArraysDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1=new int[3];
		//������a1�ĵ�һ��λ�÷���һ��8
		a1[0]=118;
		//������a1�ĵڶ���λ�÷���һ��17
		a1[1]=99;
		a1[2]=87;
		
		//��������Ԫ�ص��ܺ�
		int t=0;
		for(int i=0;i<a1.length;i++){
			t=t+a1[i];
		}
		System.out.println("����Ԫ���ܺ�="+t);
		
		//�ҳ�����������Ԫ��
		int max=0;
		for(int i=0;i<a1.length;i++){
			if(a1[i]>max){
				//���ں��Ǹ�ֵ���㣬��Զ���ǰ��ұߵ�ֵ�� ��ֵ����߱���
				max=a1[i];
			}
		}
		System.out.println("���ֵ="+max);
		
		
		
	}

}
