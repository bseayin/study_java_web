package com.xsz.javabase;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ַ���String, �ַ�����ֵ��������˫���Ű�����
		String a="abcde";
		System.out.println(a);
		// length���������ַ����ĳ���
		int b=a.length();
		System.out.println(b);
		
		String a1="ff";
		// int�����üӺţ���ʾ������ֵ��ӡ� 
		//String �ַ����üӺţ���ʾ�������ַ�������������
		String a2=a+a1;
		System.out.println(a2);
		//toUpperCase �ַ���ת��д
		String a3=a.toUpperCase();
		System.out.println(a3);
		
		//toLowerCase �ַ���תСд
		String a4=a3.toLowerCase();
		System.out.println("Сд*****"+a4);
		//�ַ������±��Ǵ�0��ʼ��Ҳ���ǵ�һ��λ�õ��±���0
		//��������ڣ�indexOf�᷵��-1
		int b1=a.indexOf("y");
		System.out.println(b1);
		//�����������һ���ӵ��ַ�������ô�±귵�����ַ����ĵ�һ��ĸ���±�
		int b2=a.indexOf("cde");
		System.out.println(b2);
		
		int b3=a.indexOf("dc");
		System.out.println(b3);
		//�ж��ַ�����ʲô��ͷ startsWith
		boolean f1=a.startsWith("d");
		System.out.println("f1="+f1);
		
		boolean f2=a.startsWith("a");
		System.out.println("f2="+f2);
		
		// �ж�����int�����Ƿ���ȣ���˫�Ⱥ� ==
		// �ж������ַ����Ƿ���ͬ,��equals����
		int x=3;
		int y=5;
				
		boolean f3=3==5;
		
		String c1="abc";
		String c2="abc";
		
		boolean f4=c1.equals(c2);
		
		System.out.println("f3="+f3);
		System.out.println("f4="+f4);
		// �ж�����int�����ǲ���ȣ�!=
		// �ж������ַ�������ͬ,��!equals����
		
		boolean f5=3!=5;
		// ���c1��c2�ַ�������ͬ���Ż᷵���棨true��
		boolean f6=!c1.equals(c2);
		
		System.out.println("f5="+f5);
		System.out.println("f6="+f6);
		
		
		
	}

}
