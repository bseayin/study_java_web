package com.xsz.v2.basic.day4;

import java.util.HashMap;

public class Test6 {
    //ͳ���ַ����д�Сд��ĸ�������ַ�����
    public static void main(String[] args) {
        String s="aadd837YYS876";
        char[] cs=s.toCharArray();
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<cs.length;i++){
            if(cs[i]>='A'&&cs[i]<='Z'){
               a++;
            }
            if(cs[i]>='a'&&cs[i]<='z'){
                b++;
            }
            if(cs[i]>='0'&&cs[i]<='9'){
                c++;
            }
        }
        System.out.println("��д��ĸ����="+a+"  Сд��ĸ����="+b+" ���ָ���="+c);




    }
}
