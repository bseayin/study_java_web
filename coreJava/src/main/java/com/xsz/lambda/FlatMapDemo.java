package com.xsz.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FlatMapDemo {
    public static void main(String[] args) {
        String s1="hello Jerry how are you ?";
        String[] ss=s1.split("");
//        for (String str:
//             ss) {
//            System.out.println(str);
//        }

        String[] words = new String[]{"Hello","World"};
        List<String[]> a = Arrays.stream(words)
                .map(word -> word.split(""))
                .distinct()
                .collect(toList());
        a.forEach(System.out::println);


        String[] words1 = new String[]{"Hello","World"};
        List<String> a1 = Arrays.stream(words)
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());
        a1.forEach(System.out::println);




    }


}
