package com.xsz.file;

import java.io.File;
import java.util.*;

public class CountMP4 {
    static int  total=0;
    static int  missed=0;
    static HashMap<String, List<String>> itemMap=new HashMap<>();
    public static void main(String[] args) {
        File root=new File("C:\\bsea\\homemacoffice\\bsea\\6months\\java12i");
        count(root);
        System.out.println("总的课时："+(total+missed));//总的课时：96   2021.1.19
        Set<Map.Entry<String, List<String>>> listEntry=itemMap.entrySet();
        for (Map.Entry<String, List<String>> entry:listEntry) {
            System.out.println("课时归属次："+entry.getKey());
            int size=entry.getValue().size();
            if(size%2!=0){
                System.out.println("******************************");
                missed++;
            }
            System.out.println("本次课时数："+size);
            for (String t:entry.getValue()) {
                System.out.println("上课时间："+t);
            }

        }
    }
    public static void count(File dir){
        File[] files=dir.listFiles();
        List<String> valueList=new ArrayList<String>();
        for (File file:files) {

            if(file.isDirectory()){
                count(file);
            }else{
                String filename=file.getName();
                if(filename.endsWith(".mp4")){
                    total++;
                    String parentName=file.getParentFile().getName();
                    String time=filename.substring(0,15);
//                    System.out.println("课时归属次："+parentName);
//                    System.out.println("课时时间："+filename.substring(0,15));
                    valueList.add(time);
                    itemMap.put(parentName,valueList);
                }
            }
        }
    }
}
