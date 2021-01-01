package com.xsz.util;

import java.util.Random;

/**
 * Created by Bsea
 * 2017-06-11 19:12
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }


    public static synchronized Long genUniqueLongKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return Long.parseLong(System.currentTimeMillis() + String.valueOf(number));
    }

    public static synchronized Integer genUniqueIntegerKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return number;
    }

    public static void main(String[] args) {
       String id= KeyUtil.genUniqueKey();
        System.out.println(id);
    }
}
