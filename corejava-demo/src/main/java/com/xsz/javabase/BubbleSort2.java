package com.xsz.javabase;

public class BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={12,98,14,15};
		//ʵ�ִ�С��������
		/**
		 * ����i=0�Ժ󣬰����ֵ98�ŵ������ұ�
		 * ����i=0�Ժ��������� 12��14��15��98
		 * ��ʵ����i=0�Ժ������˳���Ѿ�ʵ���˴�С����
		 * i=1��i=2 ��������У��������������ʵ���˷ѵģ�û��ʵ�����塣
		 * 
		 
		for(int i=0;i<a.length-1;i++){
			
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		*/
		
		/**
		 * �Ż����ð������
		 * i=2�������У���Ϊi=1��ʱ���ִ��breakֹͣforѭ������ִ�С�
		 */
		for(int i=0;i<a.length-1;i++){
			boolean flag=true;
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					flag=false;
				}
			}
			System.out.println("i="+i);
			if(flag){
				break; // break��ʾֹͣforѭ��
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
