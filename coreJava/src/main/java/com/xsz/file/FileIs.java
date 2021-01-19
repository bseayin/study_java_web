package com.xsz.file;

import java.io.File;

public class FileIs {
    public static void main(String[] args) {
        File f = new File("C:\\tmp\\1.txt");
        File f2 = new File("C:\\tmp");
//         判断是否存在
         System.out.println("C:\\tmp\\1.txt 是否存在:"+f.exists());
         System.out.println("C:\\tmp 是否存在:"+f2.exists());
//         判断是文件还是目录
         System.out.println("C:\\tmp 文件?:"+f2.isFile());
         System.out.println("C:\\tmp 目录?:"+f2.isDirectory());
         }
}
