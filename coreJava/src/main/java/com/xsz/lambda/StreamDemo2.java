package com.xsz.lambda;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        //把String转成Integer
        Stream<String> original = Stream.of("10", "12", "18");
        Stream<Integer> result = original.map(str->Integer.parseInt(str));

        Stream<Integer> original2 = Stream.of(1, 12, 18);
        Stream<Integer> result2 = original2.map(str->str*3);

        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

//        Stream<Person> result3=one.stream().map(s -> new Person(s,s.length()*10));
        Stream<Person> result3=one.stream().map(Person::new);
//        result3.forEach(person -> System.out.println(person.getName()));
//        result3.forEach(person -> System.out.println(person));
        result3.forEach(System.out::println);



    }
}
