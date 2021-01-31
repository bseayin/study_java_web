package com.xsz.file;

import java.io.*;

/**
 * 文件夹复制
 */
public class Copy2 {
    public static void main(String[] args) throws IOException {
        //源文件夹file对象
        File sourceFolder=new File("C:\\tmp\\image");
        //目标文件夹file对象
        File targetFolder=new File("C:\\tmp1\\"+sourceFolder.getName());
        targetFolder.mkdir();
        copyDir(sourceFolder,targetFolder);
     }


    public static void copyDir(File source,File target) throws IOException {
        // 获取子文件和目录
        File[] files = source.listFiles();
        // 循环打印 /*判断: 当是文件时,打印绝对路径. 当是目录时,继续调用打印目录的方法,形成递归调用. */
        for (File file : files) {
            // 判断
            if (file.isFile()) {
                // 1.1 指定数据源
                FileInputStream fis = new FileInputStream(file);
                // 1.2 指定目的地
                FileOutputStream fos = new FileOutputStream(target.getAbsoluteFile()+"\\"+file.getName());
                // 2.读写数据 // 2.1 定义数组
                byte[] b = new byte[1024];
                // 2.2 定义长度
                int len;
                // 2.3 循环读取
                while ((len = fis.read(b))!=-1) {

                    // 2.4 写出数据
                    fos.write(b, 0 , len);
                }
                // 3.关闭资源
                fos.close();
                fis.close();
                //如果要剪切
//                file.delete();

            } else {
                // 是目录,输出目录绝对路径 System.out.println("目录:"+file.getAbsolutePath());
                // 继续遍历,调用printDir,形成递归
                copyDir(file,target);
            }
        }
    }
}
