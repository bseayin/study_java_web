package com.xsz.file;

import java.io.*;

public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TextContent textContent=new TextContent();
        textContent.setNo(1);
        textContent.setContent("序列化测试撒旦范德萨发生的地方");
        //开始序列化
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\tmp\\2.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(textContent);
        objectOutputStream.close();
        fileOutputStream.close();
        //序列化结束
        //开始反序列化
        FileInputStream fileInputStream=new FileInputStream("C:\\tmp\\2.txt");
        ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
        TextContent e=(TextContent)objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        System.out.println(e.getNo()+"***********"+e.getContent());
        //反序列化结束
    }
}
