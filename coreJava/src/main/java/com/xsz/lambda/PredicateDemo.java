package com.xsz.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女","古力娜扎,女","马儿扎哈,男","赵丽颖,女"};
        a(array,s -> {
            return  s.split(",")[0].length() == 4&&s.split(",")[1].equals("女");
        }
        );
        ArrayList<String> rs2=a2(array,s ->
                { return  s.split(",")[0].length() == 4;},s ->s.split(",")[1].equals("女")

        );
//        System.out.println(rs);
        System.out.println(rs2);
    }
    public static ArrayList<String> a(String[] array, Predicate<String> p1){
        ArrayList<String> list = new ArrayList<>();
        for (String str : array){
            boolean bo = p1.test(str);
            if (bo){
                list.add(str);
            }
        }

        System.out.println(list);
        return list;
    }

    public static ArrayList<String> a2(String[] array, Predicate<String> p1, Predicate<String> p2){
        ArrayList<String> list = new ArrayList<>();
        for (String str : array){
            boolean bo = p1.and(p2).test(str);
            if (bo){
                list.add(str);
            }
        }
        return list;
    }
}
