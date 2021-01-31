package com.xsz.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FISRead2 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
         FileInputStream fis = new FileInputStream("C:\\tmp\\fos.txt");
        int b;
        byte[] bs=new byte[8];
        while ((b = fis.read(bs))!=-1){
            System.out.println(new String(bs));
        }
         fis.close();
    }
}
