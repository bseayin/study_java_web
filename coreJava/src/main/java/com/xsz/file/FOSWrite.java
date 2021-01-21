package com.xsz.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSWrite {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
         FileOutputStream fos = new FileOutputStream("C:\\tmp\\fos.txt",true);
//         写出数据
        fos.write(97);
//         写出第1个字节
    fos.write(98);
//         写出第2个字节
    fos.write(99);
//        fos.write("hello");

        fos.write("hello".getBytes());
    //表示换行
        fos.write("\r\n".getBytes());
        fos.write("yyyyyyyyyyyyyyyyy".getBytes());
        // 写出第3个字节
        // 关闭资源
         fos.close();
         }
}
