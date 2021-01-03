package com.xsz.arry;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        /*
         * 1: 准备牌操作
         */
        //1.1 创建牌盒 将来存储牌面的
        ArrayList<String> pokerBox = new ArrayList<String>();
        //1.2 创建花色集合
        ArrayList<String> colors = new ArrayList<String>();

        //1.3 创建数字集合
        ArrayList<String> numbers = new ArrayList<String>();

        //1.4 分别给花色 以及 数字集合添加元素
        colors.add("红头");
        colors.add("黑头");
        colors.add("梅花");
        colors.add("方片");

        for(int i = 2;i<=10;i++){
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        //1.5 创造牌  拼接牌操作
        // 拿出每一个花色  然后跟每一个数字 进行结合  存储到牌盒中
        for (String color : colors) {
            //color每一个花色
            //遍历数字集合
            for(String number : numbers){
                //结合
                String card = color+number;
                //存储到牌盒中
                pokerBox.add(card);
            }
        }
        //1.6大王小王
        pokerBox.add("小王");
        pokerBox.add("大王");
        // System.out.println(pokerBox);
        //洗牌 是不是就是将  牌盒中 牌的索引打乱
        // Collections类  工具类  都是 静态方法
        // shuffer方法
        /*
         * static void shuffle(List<?> list)
         *     使用默认随机源对指定列表进行置换。
         */
        //2:洗牌
        Collections.shuffle(pokerBox);
        //3 发牌
        //3.1 创建 三个 玩家集合  创建一个底牌集合
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        //遍历 牌盒  必须知道索引
        for(int i = 0;i<pokerBox.size();i++){
            //获取 牌面
            String card = pokerBox.get(i);
            //留出三张底牌 存到 底牌集合中
            if(i>=51){//存到底牌集合中
                dipai.add(card);
            } else {
                //玩家1   %3  ==0
                if(i%3==0){
                    player1.add(card);
                }else if(i%3==1){//玩家2
                    player2.add(card);
                }else{//玩家3
                    player3.add(card);
                }
            }
        }
        //看看
        System.out.println("令狐冲："+player1);
        System.out.println("田伯光："+player2);
        System.out.println("绿竹翁："+player3);
        System.out.println("底牌："+dipai);

//        System.out.println( verify("大王","小王"));

        System.out.println( verify2("方片10","黑头J"));
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
        if("大王".equals(p1)){
            return false;
        }
        if("小王".equals(p1)){
            if("大王".equals(p2)){
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
      return  "A".equals(a)?"14":"J".equals(a)?"11":"Q".equals(a)?"12":"2".equals(a)?"15":"大王".equals(a)?"17":"小王".equals(a)?"16":"K".equals(a)?"13":a;
    }
}
