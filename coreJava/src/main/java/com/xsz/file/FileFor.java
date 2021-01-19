package com.xsz.file;

import java.io.File;

public class FileFor {
    public static void main(String[] args) {
        File dir = new File("C:\\tmp\\新建文件夹 (2)");
        //获取当前目录下的文件以及文件夹的名称。
         String[] names = dir.list();
         for(String name : names){
         System.out.println(name);
         }

        //获取当前目录下的文件以及文件夹对象，只要拿到了文件对象，那么就可以获取更多信息
         File[] files = dir.listFiles();
         for (File file : files) {
             System.out.println(file);
             System.out.println(file.length());
         }
    }
}
