package com.xsz.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        // �������ڶ��󣬰ѵ�ǰ��ʱ��
        System.out.println(new Date());
        // �������ڶ��󣬰ѵ�ǰ�ĺ���ֵת�����ڶ���
        System.out.println(new Date(0L));
        System.out.println(new Date(1000L));
        Long a= System.currentTimeMillis();
        System.out.println(a);
        System.out.println(new Date(1609247710993L));

        // ��Ӧ�����ڸ�ʽ�磺2018-01-16 15:06:38
        DateFormat formatObj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date date=new Date();
        //Date תString
       String str= formatObj.format(date);
        System.out.println(str);
        //ֻҪ������

        DateFormat formatObj2 = new SimpleDateFormat("yyyy-MM-dd");

        //Date תString
        String str2= formatObj2.format(date);
        System.out.println(str2);

        DateFormat formatObj3 = new SimpleDateFormat("yyyy/MM/dd");
        //Date תString
        String str3= formatObj3.format(date);
        System.out.println(str3);

        // String ת Date
        String dateString1="2000-12-29";
        String dateString2="2020-12-29 21:33:36";

        Date date1=formatObj2.parse(dateString1);
        Date date2=formatObj.parse(dateString2);
        System.out.println(date1);
        System.out.println(date2);
        Long time1= date1.getTime();
        Long current=new Date().getTime();
        Long time2=current-time1;
        Long days=time2/(24*60*60*1000);
        System.out.println(days);









    }
}
