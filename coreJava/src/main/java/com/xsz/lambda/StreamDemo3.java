package com.xsz.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        String s=one.stream().collect(Collectors.joining());
        System.out.println(s);
        String s1=one.stream().collect(Collectors.joining("*****"));
        System.out.println(s1);
        List<String> two=one.stream().filter(s2 -> s2.length()==3).collect(Collectors.toList());
        ArrayList<Integer> three = new ArrayList<>();
        Collections.addAll(three,1,2,2,4,5,6);
        List<Integer> four=three.stream().distinct().collect(Collectors.toList());
        four.stream().forEach(s3-> System.out.println(s3));

        Stream<Person> result3=one.stream().map(s5 -> new Person(s5,s5.length()*10));
        List<Person> personList= result3.collect(Collectors.toList());
        personList.forEach(System.out::println);
        IntSummaryStatistics stats = personList.stream().collect(Collectors.summarizingInt(Person::getAge));
        System.out.println("最大年龄："+stats.getMax());
        System.out.println("平均年龄："+stats.getAverage());
        System.out.println("总年龄："+stats.getSum());
    }
}
