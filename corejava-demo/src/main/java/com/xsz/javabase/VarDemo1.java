package com.xsz.javabase;
// class ����ı�ʾ�������
public class VarDemo1 {
	// ���ڷ������涨��ı�����ȫ�ֱ���
	int dd=9;
	// �����ĸ�ʽ:  ���η�  ����������(){}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarDemo1 v1=new VarDemo1();
		v1.test1();
		// ������ ����  ��������=ֵ
		int a=v1.test2();
		System.out.println(a);
		int b=v1.add(61,8);
		System.out.println(b);
	}
	

	/**
	 * ����ע��
	 * void ��ʾ�������û�з���ֵ
	 * test1 ��ʾ����������
	 * {������}
	 */
	void test1(){
		// �������涨��ı����оֲ�����
		int d=9;
		System.out.println(d);
		System.out.println(dd);
		System.out.println("�����ʾtest1������ִ����");
	}
	
	/**
	 * int��ʾ�����ķ���ֵ������8
	 * @return
	 */
	int test2(){
		System.out.println(dd);
		System.out.println("�����ʾtest2������ִ����");
		return 8;
	}
	/**
	 * int��ʾ�����ķ���ֵ����������
	 * (int a, int b) ��ʾ�������������������������������int����
	 * @return
	 */
	int add(int a, int b){
		return a+b;
	}

}
