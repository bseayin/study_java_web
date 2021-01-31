package com.xsz.file;

import java.io.*;
import java.util.*;

public class BuffuredFileDemo2 {
    public static void main(String[] args) throws IOException {
        List<TextContent> list=new ArrayList<TextContent>();
        BufferedReader br = new BufferedReader(new FileReader("E:\\test\\1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\test\\2.txt"));
        String line = null;
        while ((line = br.readLine()) != null){
            String s = line;
            s = s.trim();
//            map.put(Integer.parseInt(s.substring(0,1)),s.substring(1,s.length()));
            TextContent textContent=new TextContent();
            textContent.setNo(Integer.parseInt(s.substring(0,1)));
            textContent.setContent(s.substring(1,s.length()));
            list.add(textContent);
        }
        list.sort(new Comparator<TextContent>() {
            @Override
            public int compare(TextContent o1, TextContent o2) {
                return o1.getNo()-o2.getNo();
            }
        });

        for (TextContent key : list){
            String value = key.getContent();
            bw.write(key+""+value);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
