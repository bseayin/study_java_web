package com.xsz.v2.basic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //原来写法
        // list.add(12); //list.add(14); //list.add(15); //list.add(1000);
        // 采用工具类 完成 往集合中添加元素
        Collections.addAll(list, 5, 222, 1,2,8,9,2322,4535);
        System.out.println(list);
        // 排序方法
        Collections.sort(list, new Comparator<Integer>() {
            // 这个方法返回负数，表示从大到小
            public int compare(Integer o1, Integer o2) {
                //如果想从大到小排序，那么o2-o1结果肯定是负数，
                return o2-o1;
            }
        });
        System.out.println(list);
    }
}
