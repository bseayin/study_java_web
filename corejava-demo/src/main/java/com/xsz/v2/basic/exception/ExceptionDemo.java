package com.xsz.v2.basic.exception;

public class ExceptionDemo {

    public static void main(String[] args) throws Exception {
        /**
         * �����쳣�����ַ�ʽ
         * 1. �ڷ�����ǩ���ϣ�ֱ���׳�throws Exception����˼�����Լ��������õ�����������ĵط�����
         * 2. ͨ��try catch�����쳣
         */
        try{
            a(8);

        }catch (Exception e){
           e.printStackTrace();
        }

        System.out.println("1�����쳣�Ժ�");
        a(8);
        System.out.println("2�����쳣�Ժ�");
    }

    private static void a(int i) throws Exception {
        if(i%2==0){
            throw new Exception("�Ҳ�Ҫż��");
        }
    }
}
