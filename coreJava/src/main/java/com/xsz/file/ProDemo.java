package com.xsz.file;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

public class ProDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建属性集对象
         Properties properties = new Properties();
        // 添加键值对元素
         properties.setProperty("filename", "1.jpg");

         properties.setProperty("location", "C:\\tmp\\1.jpg");
        // 打印属性集对象
         System.out.println(properties);
        // 通过键,获取属性值
         System.out.println(properties.getProperty("filename"));
         System.out.println(properties.getProperty("length"));
         System.out.println(properties.getProperty("location"));
        // 遍历属性集,获取所有键的集合
        Set<String> strings = properties.stringPropertyNames();
        // 打印键值对
         for (String key : strings ) {
         System.out.println(key+" ‐‐ "+properties.getProperty(key));
         } }

}
