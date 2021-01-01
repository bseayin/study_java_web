package com.xsz.v2.basic.day3;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDemo {
    public static void main(String[] args) {
//        printCount();
        printCount2();
    }
    public static void  printCount (){
        char[] cs={'a','l','f','m','f','o','b','b','s','n'};
        /**
         * ˼·һ��
           ����HashMap, key=�ַ��� value=�ַ����ֵĴ���
         **/
        HashMap<Character,Integer> count=new HashMap<Character, Integer>();
        for (int i=0;i<cs.length;i++){
            if( count.containsKey(cs[i])){
                int a=count.get(cs[i]);
                a=a+1;
                count.put(cs[i],a);

            }else{
                count.put(cs[i],1);
            }
        }
        System.out.println(count);
    }
    /**
     * ˼·����
       ������ĸASCII�롣 a��Ӧ��ASCIIֵ��97
       ����int[] count�� �±���key, �±��Ӧλ���ϵ�ֵ���ǳ��ֵĴ���
     **/
    public static void printCount2() {
        char[] charArray={'a','l','f','m','f','o','b','b','s','n'};
        //һ��26����ĸ������26���԰���������ĸ
        int[] count= new int[26];
        // ��Ӧ������ĸ���ֵĴ���
        for (int i = 0; i < charArray.length; i++) {
            // char ת int   ��ĸ�Զ�ת���˶�Ӧ��ASCII�룬a��ֵ��97
            int c  = charArray[i];
            count[c- 97]++;
        }
        // ��ӡ��ĸ�ʹ���
        for (int i = 0, ch = 97; i < count.length; i++, ch++) {
            if (count[i] != 0 ) {
                //(char) ch ��   int ת char   97 ת��char�Ժ�ͳ��� a
                System.out.println((char) ch + "--" + count[i]);
            }
        }
    }
}
