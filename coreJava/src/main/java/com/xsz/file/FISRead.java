package com.xsz.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FISRead {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
         FileInputStream fis = new FileInputStream("C:\\tmp\\fos.txt");
//        // 读取数据，返回一个字节
//         int read = fis.read();
//         System.out.println((char) read);
//         read = fis.read();
//         System.out.println((char) read);
//         read = fis.read();
//         System.out.println((char) read);
//         read = fis.read();
//         System.out.println((char) read);
//         read = fis.read();
//         System.out.println((char) read);
//        // 读取到末尾,返回‐1
//         read = fis.read();
//         System.out.println( read);
        // 关闭资源


        // 使用文件名称创建流对象 FileInputStream fis = new FileInputStream("read.txt");
//        FileInputStream fis = new FileInputStream("read.txt"); // 定义变量，保存数据 int b ；
        // 循环读取
        int b;
        while ((b = fis.read())!=-1){
            System.out.println((char) b);
        }
         fis.close();
         }
}
