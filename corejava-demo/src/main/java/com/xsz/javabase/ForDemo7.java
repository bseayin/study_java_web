package com.xsz.javabase;

public class ForDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1=new int[5];
		a1[0]=12;
		a1[1]=11;
		a1[2]=55;
		a1[3]=22;
		a1[4]=323;
		//需要把a1里面的奇数都放到a2里面
		int[] a2=new int[5];
		
		for(int i=0;i<a1.length;i++){
			if(a1[i]%2!=0){
				a2[i]=a1[i];
			}
		}
	}

}
