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
         * 思路一：
           创建HashMap, key=字符， value=字符出现的次数
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
     * 思路二：
       利用字母ASCII码。 a对应的ASCII值是97
       数组int[] count， 下标是key, 下标对应位置上的值就是出现的次数
     **/
    public static void printCount2() {
        char[] charArray={'a','l','f','m','f','o','b','b','s','n'};
        //一共26个字母，所以26可以包含所有字母
        int[] count= new int[26];
        // 对应保存字母出现的次数
        for (int i = 0; i < charArray.length; i++) {
            // char 转 int   字母自动转成了对应的ASCII码，a的值是97
            int c  = charArray[i];
            count[c- 97]++;
        }
        // 打印字母和次数
        for (int i = 0, ch = 97; i < count.length; i++, ch++) {
            if (count[i] != 0 ) {
                //(char) ch ：   int 转 char   97 转成char以后就成了 a
                System.out.println((char) ch + "--" + count[i]);
            }
        }
    }
}
