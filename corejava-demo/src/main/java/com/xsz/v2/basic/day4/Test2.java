package com.xsz.v2.basic.day4;

public class Test2 {
    public static void main(String[] args) {
        //�����ַ�������
         String s = "helloworld";
        // int length():��ȡ�ַ����ĳ��ȣ���ʵҲ�����ַ�����
         System.out.println(s.length());
         System.out.println("�\�\�\�\�\�\�\�\");
        // String concat (String str):����ָ�����ַ������ӵ����ַ�����ĩβ.
        // String s = "helloworld";
         String s2 = s.concat("**hello itheima");
        System.out.println(s2);
        // helloworld**hello itheima
        // char charAt(int index):��ȡָ�����������ַ�
         System.out.println(s.charAt(0));
         System.out.println(s.charAt(1));
         System.out.println("�\�\�\�\�\�\�\�\");
        // int indexOf(String str):
        // ��ȡstr���ַ��������е�һ�γ��ֵ�����,
        // û�з��ة\1 System.out.println(s.indexOf("l"));
         System.out.println(s.indexOf("owo"));
         System.out.println(s.indexOf("ak"));
         System.out.println("�\�\�\�\�\�\�\�\");
        // String substring(int start):
        // ��start��ʼ��ȡ�ַ������ַ�����β
         System.out.println(s.substring(0));
         System.out.println(s.substring(5));
         System.out.println("�\�\�\�\�\�\�\�\");
        // String substring(int start,int end):��start��end��ȡ�ַ�������start������end��
         System.out.println(s.substring(0, s.length()));
         System.out.println(s.substring(3,8));
        System.out.println("�\�\�\�\�\�\�\�\");
        System.out.println(s.replace("l","y"));

        //�����ַ�������
         String s4 = "aa$bb$cc";
         String[] strArray = s4.split("$");
        // ["aa","bb","cc"]
         for(int x = 0; x < strArray.length; x++) {
         System.out.println(strArray[x]);

         }

    }
}
