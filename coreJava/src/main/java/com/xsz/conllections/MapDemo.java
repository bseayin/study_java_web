package com.xsz.conllections;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap();
        map.put(56,"不及格");
        map.put(96,"优秀");
        String val1=map.get(56);
        String val2=map.getOrDefault(56,"不知道");
        System.out.println(val1);
        System.out.println(val2);

    }
}
