package com.xsz.String;

public class T {
    public static void main(String[] args) {
        String a="12";
        // string ת int ͨ��Integer.parseInt
        //String ת�������ͣ�һ�㶼��ͨ����Ӧ�İ�װ���parse*����
        int c=Integer.parseInt(a);
        test(c);
        int b=88;
        // ��������תString �� �������͵�ֵ+����
        String s=b+"";
        test1(s);

    }

    public static void test (int b){
        System.out.println(b);
    }

    public static void test1 (String b){
        System.out.println(b);
    }
}
