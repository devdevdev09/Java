package com.example.java.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateTest {
    public static void main(String[] args) {
        DateTest dt = new DateTest();

        System.out.println("date1 : " + dt.date1("20201221"));
        System.out.println("date2 : " + dt.date2("20201221"));
    }

    public String date1(String date1) {
        Calendar cal = Calendar.getInstance(Locale.KOREA);
        TimeZone timezone = cal.getTimeZone();
        timezone = TimeZone.getTimeZone("Asia/Seoul");
        cal = Calendar.getInstance(timezone);
        cal.add(Calendar.DATE, -1);
        
        Date date = null;

        try{
            // date = DateFormat.parse("2020-12-21");
        }catch(Exception e){

        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        return sdf.format(date);
    }

    public String date2(String date1) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
        Date date = null;
        try {
            date = sdf.parse(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        date.setTime(date.getTime() + 1 * 1000L * 60L * 60L * 24L);
        return sdf.format(date);
    }
}
