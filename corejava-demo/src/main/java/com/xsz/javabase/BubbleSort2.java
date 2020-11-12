package com.xsz.javabase;

public class BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={12,98,14,15};
		//实现从小到大排序
		/**
		 * 经过i=0以后，把最大值98放到了最右边
		 * 所以i=0以后，数组变成了 12，14，15，98
		 * 其实经过i=0以后，数组的顺序已经实现了从小到大
		 * i=1和i=2 会继续运行，但是这次运行其实是浪费的，没有实现意义。
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
		 * 优化后的冒泡排序
		 * i=2不会运行，因为i=1的时候会执行break停止for循环继续执行。
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
				break; // break表示停止for循环
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
