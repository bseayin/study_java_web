package com.xsz.String;

public class Demo02StringBuilder {
    public static void main(String[] args) {
        //��������
        StringBuilder builder = new StringBuilder();
        //public StringBuilder append(��������)
        StringBuilder builder2 = builder.append("hello");
        //�Ա�һ��
        System.out.println("builder:"+builder);
        System.out.println("builder2:"+builder2);
        System.out.println(builder == builder2); //true
        // ������� �κ�����
        builder.append("hello");
        builder.append("world");
        builder.append(true);
        builder.append(100);
        // �����ǿ����У�����������һ�������󣬷���һ������������Ȼ��ʹ�÷��صĶ���������÷�����
        // ����ʱ�����ǾͿ��԰Ѵ�������һ����append����һ������������
        //��ʽ���
        builder.append("hello").append("world").append(true).append(100);
        System.out.println("builder:"+builder);
    }
}
