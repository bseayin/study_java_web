package com.xsz.date;

import java.util.Calendar;

public class CalendarUtil {
    public static void main(String[] args) {
        // ����Calendar����
        Calendar cal = Calendar.getInstance();
        // ������
        int year = cal.get(Calendar.YEAR);
        // ������
        int month = cal.get(Calendar.MONTH) + 1;
        // ������
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.print(year + "��" + month + "��" + dayOfMonth + "��");
    }
}
