package com.xsz.lambda;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //第一支队伍
         ArrayList<String> one = new ArrayList<>();
         one.add("迪丽热巴");
         one.add("宋远桥");
         one.add("苏星河");
         one.add("石破天");
         one.add("石中玉");
         one.add("老子");
         one.add("庄子");
         one.add("洪七公");
         one.add("洪8公");
         one.add("洪9公");
        ArrayList<String> two = new ArrayList<>();
        two.add("刘德华");
//        第一个队伍只要名字为3个字的成员姓名
        Stream<String> stream1=one.stream().filter(s->s.length()==3);
        stream1.forEach(s -> System.out.println(s));
        System.out.println("********************************");
        // 第一个队伍筛选之后只要前3个人；
        Stream<String> stream2=one.stream().filter(s->s.length()==3).limit(3);
        stream2.forEach(s -> System.out.println(s));
        System.out.println("********************************");
        // 姓洪的成员姓名；
        Stream<String> stream3=one.stream().filter(s->s.startsWith("洪"));
        stream3.forEach(s -> System.out.println(s));
        System.out.println("********************************");
        // 个队伍筛选之后不要前2个人；
        Stream<String> stream4=one.stream().filter(s->s.startsWith("洪")).skip(2);
        stream4.forEach(s -> System.out.println(s));
        System.out.println("********************************");
        Stream<String> stream5= Stream.concat(one.stream(),two.stream());
        stream5.forEach(s -> System.out.println(s));

    }
}
