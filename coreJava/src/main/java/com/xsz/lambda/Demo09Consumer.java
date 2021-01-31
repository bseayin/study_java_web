package com.xsz.lambda;

import java.util.function.Consumer;

public class Demo09Consumer {
    private static void consumeString(Consumer<String> function) {
        function.accept("Hello");
    }

    public static void main(String[] args) {
        consumeString((String str)->System.out.println(str));
    }
}
