package com.xsz.arry;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        /*
         * 1: ׼���Ʋ���
         */
        //1.1 �����ƺ� �����洢�����
        ArrayList<String> pokerBox = new ArrayList<String>();
        //1.2 ������ɫ����
        ArrayList<String> colors = new ArrayList<String>();

        //1.3 �������ּ���
        ArrayList<String> numbers = new ArrayList<String>();

        //1.4 �ֱ����ɫ �Լ� ���ּ������Ԫ��
        colors.add("��ͷ");
        colors.add("��ͷ");
        colors.add("÷��");
        colors.add("��Ƭ");

        for(int i = 2;i<=10;i++){
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        //1.5 ������  ƴ���Ʋ���
        // �ó�ÿһ����ɫ  Ȼ���ÿһ������ ���н��  �洢���ƺ���
        for (String color : colors) {
            //colorÿһ����ɫ
            //�������ּ���
            for(String number : numbers){
                //���
                String card = color+number;
                //�洢���ƺ���
                pokerBox.add(card);
            }
        }
        //1.6����С��
        pokerBox.add("С��");
        pokerBox.add("����");
        // System.out.println(pokerBox);
        //ϴ�� �ǲ��Ǿ��ǽ�  �ƺ��� �Ƶ���������
        // Collections��  ������  ���� ��̬����
        // shuffer����
        /*
         * static void shuffle(List<?> list)
         *     ʹ��Ĭ�����Դ��ָ���б�����û���
         */
        //2:ϴ��
        Collections.shuffle(pokerBox);
        //3 ����
        //3.1 ���� ���� ��Ҽ���  ����һ�����Ƽ���
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        //���� �ƺ�  ����֪������
        for(int i = 0;i<pokerBox.size();i++){
            //��ȡ ����
            String card = pokerBox.get(i);
            //�������ŵ��� �浽 ���Ƽ�����
            if(i>=51){//�浽���Ƽ�����
                dipai.add(card);
            } else {
                //���1   %3  ==0
                if(i%3==0){
                    player1.add(card);
                }else if(i%3==1){//���2
                    player2.add(card);
                }else{//���3
                    player3.add(card);
                }
            }
        }
        //����
        System.out.println("����壺"+player1);
        System.out.println("�ﲮ�⣺"+player2);
        System.out.println("�����̣�"+player3);
        System.out.println("���ƣ�"+dipai);

//        System.out.println( verify("����","С��"));

        System.out.println( verify2("��Ƭ10","��ͷJ"));
    }
    public static boolean verify2(String p1,String p2){
        if(p1.length()<3){
            p1=convert(p1);
        }else {
            p1=convert(p1.substring(2));

        }
        if(p2.length()<3){
            p2=convert(p2);
        }else {
            p2=convert(p2.substring(2));

        }
        return  Integer.parseInt(p1)<Integer.parseInt(p2);
    }

    public static boolean verify(String p1,String p2){
        boolean flag=false;
        if("����".equals(p1)){
            return false;
        }
        if("С��".equals(p1)){
            if("����".equals(p2)){
                return true;
            }else{
                return false;
            }
        }
        if(p2.length()<3){
            return true;
        }
        int a=Integer.parseInt(p1.substring(2));
        int b=Integer.parseInt(p2.substring(2));

        if(a==2){
            return false;
        }else if(a==1){
            if(b==2){
                return true;
            }else {
                return false;
            }
        }

        if(b<3){
            return true;
        }

        if(a>=b){
            return false;
        }else {
            return true;
        }
    }

    public static  String convert(String a){
      return  "A".equals(a)?"14":"J".equals(a)?"11":"Q".equals(a)?"12":"2".equals(a)?"15":"����".equals(a)?"17":"С��".equals(a)?"16":"K".equals(a)?"13":a;
    }
}
