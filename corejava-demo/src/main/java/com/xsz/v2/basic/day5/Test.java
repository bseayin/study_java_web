package com.xsz.v2.basic.day5;

public class Test {
    public static void main(String[] args) {
        Product product=new Product();
        product.setCreateDate("2020-12-29");
        product.setName("Æ»¹û");

        Product product2=new Product();
        product2.setCreateDate("2020-12-29");
        product2.setName("Æ»¹û");

        boolean flag=product.equals(product2);

        System.out.println(flag);
        System.out.println(product2);
    }
}
