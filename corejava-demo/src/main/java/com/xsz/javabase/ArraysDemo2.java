package com.xsz.javabase;

public class ArraysDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] b1=new String[5];
		b1[0]="ab";
		b1[1]="123";
		b1[2]="����";
		b1[3]="qq";
		b1[4]="΢��";
		//i++��������  �൱�� i=i+1
		//forѭ�������� 
		for(int i=0;i<b1.length;i++){
			String t=b1[i];
			System.out.println(t);
		}
		
		
		
	}

}
