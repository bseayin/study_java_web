package com.xsz.v2.basic.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();

    //添加元素
         link.addFirst("abc1");
         link.addFirst("abc1");
         link.addFirst("abc1");
         link.addFirst("abc2");
         link.addFirst("abc3");
         System.out.println(link);
        // 获取元素
         System.out.println(link.getFirst());
         System.out.println(link.getLast());
        // 删除元素
//         System.out.println(link.removeFirst());
//         System.out.println(link.removeLast());
        // 判断集合是否为空
//         while (!link.isEmpty()) {
//             // 弹出集合中的栈顶元素
////         System.out.println(link.peek());
//             link.removeFirst();
//
//
//         }
        System.out.println("遍历link集合开始*****");
        System.out.println(link.get(2));
        for (String e:link) {
            System.out.println(e);
        }
         System.out.println(link);
         }
}
