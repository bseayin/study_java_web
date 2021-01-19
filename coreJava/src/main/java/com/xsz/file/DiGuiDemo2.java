package com.xsz.file;

import java.io.File;

public class DiGuiDemo2 {
    public static void main(String[] args) {
//         创建File对象
        File dir = new File("C:\\tmp");
        // 调用打印目录方法
         printDir(dir);
         }
         public static void printDir(File dir) {
            // 获取子文件和目录
             File[] files = dir.listFiles();
            // 循环打印 /*判断: 当是文件时,打印绝对路径. 当是目录时,继续调用打印目录的方法,形成递归调用. */
             for (File file : files) {
                // 判断
                 if (file.isFile()) {
                // 是文件,输出文件绝对路径
                     String filename=file.getAbsolutePath();
                     /**
                      * String 常用方法
                      * endsWith(参数字符串) 返回是否 以参数字符串结尾
                      * startsWith(参数字符串) 返回是否 以参数字符串开头
                      * indexOf(参数字符串) 返回参数字符串在原字符串中的下标， 如果不存在就返回-1
                      * charAt(下标) 返回 下标位置的字符
                      * contains(参数字符串) 是否 包含参数字符
                      * substring(下标), 从 参数下标开始，一直截取到结尾
                      * substring(开始下标，结束下标), 从 截取两个下标直接的字符串
                      */

                     if(filename.endsWith(".java")){
                         System.out.println("文件名:"+ filename);
                     }

                 } else {
                // 是目录,输出目录绝对路径 System.out.println("目录:"+file.getAbsolutePath());
                // 继续遍历,调用printDir,形成递归
                     printDir(file);
                 }
             }
         }
}
