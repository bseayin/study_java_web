package com.xsz.file;

import java.io.File;

public class FileGet {
    public static void main(String[] args) {
        File f = new File("C:\\bsea\\workspace\\study\\coreJava\\src\\main\\java\\com\\xsz\\lambda\\Cook.java");
        System.out.println("文件绝对路径:"+f.getAbsolutePath());
        System.out.println("文件构造路径:"+f.getPath());
        System.out.println("文件名称:"+f.getName());
        System.out.println("文件长度:"+f.length()+"字节");
        File f2 = new File("coreJava\\src\\main\\java\\com\\xsz\\lambda\\Cook.java");
        System.out.println("目录绝对路径:"+f2.getAbsolutePath());
        System.out.println("目录构造路径:"+f2.getPath());
        System.out.println("目录名称:"+f2.getName());
        System.out.println("目录长度:"+f2.length());
    }
}
