package com.xsz.javabase;

public class IntDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int ��ʾ����
		 * ���еı�ʶ����Ӧ������ĸ��A-Z ���� a-z��,��Ԫ����$���������»��ߣ�_����ʼ
		 */
		int a=12;
		int b=6;
		//�ӷ�
		int c=a+b;
		//����
	    int g=a-b;
		//�˷�
		int d=a*b;
		//����
		int h=a/b;
		System.out.println(c);
		System.out.println(g);
		System.out.println(d);
		System.out.println(h);
		
		int ab=8;
		System.out.println(ab);
		//��ʾ�������� �൱�� ab=ab+1;
		ab++;
		System.out.println(ab);
		
		int ac=6;
		ac--;
		System.out.println(ac);
		ac--;
		System.out.println(ac);
		
		int ad=8;
		int ah=5;
		// % ��ʾ ��ȡ ����
		int add=ad%ah;
		System.out.println(add);
		int hh=88;
		// �ж�һ������������ ����ż��������ͨ����2ȡ�࣬���ȡ������0 ��ʾż����������������
		int hd=hh%2;
		System.out.println(hd);
		
	}

}
