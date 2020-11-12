package com.xsz.javabase;
//基本思想：外层循环每一次经过两两比较，把每一轮未排定部分最大的元素放到了数组的末尾；
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 相当于：
		 * int[] a=new int[3]
		 * a[0]=12
		 * a[1]=324
		 * a[2]=6
		 */
		int[] a={12,324,6};
		System.out.println("****没有排序之前的顺序******");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		//冒泡排序， 让这个数组里面的数据从小到大排序
	    //第一个for循环是程序需要执行要走多少趟
		// 因为最大的已经在最右边，第二大的已经在右边第二个位置，剩下的第三个肯定是最小的，
		//所以没有必要再多运行一次。
		for(int i=0;i<a.length-1;i++){
			//每次外面的大for循环i, 都是把最大的值放到了最右边
			/**
			 * 经过i=0以后，数组变成了 12，6，324
			 *  因为324已经在最大值，已经放到数组的最右边了，所以最右边的数不需要参与下次比较
			 *  i=1的时候，里面for循环，不需要再考虑最右边的数据，所以运行次数-1
			 */
			 //第二个for循环是每趟需要比较多少次
			for(int j=0;j<a.length-1-i;j++){
				//如果需要从大到小，只需要这个地方，把大于 改成小于
				if(a[j]>a[j+1]){
					//把a[j]和a[j+1]的值互换
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		
	
		System.out.println("****排序之后的顺序******");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}

}
