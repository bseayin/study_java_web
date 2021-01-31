package com.xsz.lambda;

import java.util.function.Function;

public class FunctionDemo {
    private static void method(Function<String, String> one, Function<String, Integer>two, Function<Integer, Integer>three, String str){
        int a = one.andThen(two.andThen(three)).apply(str);
        System.out.println(a);
    }

    public static void main(String[] args) {
        String str = "赵丽颖,20";
        method(s ->s.split(",")[1],
               s->Integer.parseInt(s),
                s->s+100,
                str
        );
    }
}
