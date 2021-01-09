package com.xsz.v2.basic.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
    set.add("bbb");
    set.add("aaa");
    set.add("abc");
    set.add("bbc");
    Iterator<String> it = set.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    } }
}
