package com.xsz.file;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BuffuredFileDemo {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("E:\\test\\1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\test\\2.txt"));
        String line = null;
        while ((line = br.readLine()) != null){
            String s = line;
            s = s.trim();
            map.put(Integer.parseInt(s.substring(0,1)),s.substring(1,s.length()));
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(map.keySet());
//        for (int i : map.keySet()){
//            list.add(i);
//        }

        Collections.sort(list);

        for (Integer key : list){
            String value = map.get(key);
            bw.write(key+""+value);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
