package com.example.java.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/java/calendar")
public class CalendarMain {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    // public static void main(String[] args){
    //     CalendarMain main = new CalendarMain();
    //     main.getCalcDate();
    // }

    @RequestMapping(value = "/getToday")
    public Map<String, Object> getToday(){
        Map<String,Object> result = new HashMap<String,Object>();

        Calendar cal = Calendar.getInstance();
        
        logger.info("getTime() :: " + cal.getTime()); 
        result.put("getTime() :: ", cal.getTime());
        
        SimpleDateFormat sdf = new SimpleDateFormat();
        logger.info("sdf.format(cal.getTime()) :: " + sdf.format(cal.getTime()));
        result.put("sdf.format(cal.getTime()) :: ", sdf.format(cal.getTime()));

        SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd");
        logger.info("sdf2.format(cal.getTime()) :: " + sdf2.format(cal.getTime()));
        result.put("sdf2.format(cal.getTime()) :: ", sdf2.format(cal.getTime()));

        return result;
    }

    public void getDate(){
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd hh-mm-ss");
        logger.info("sdf2.format(cal.getTime()) :: " + sdf2.format(cal.getTime()));

        logger.info("cal.get(Calendar.YEAR) :: " + cal.get(Calendar.YEAR));

        logger.info("cal.get(Calendar.MONTH) :: " + (cal.get(Calendar.MONTH) + 1));

        logger.info("cal.get(Calendar.DATE) :: " + cal.get(Calendar.DATE));

        logger.info("cal.get(Calendar.HOUR) :: " + cal.get(Calendar.HOUR));
        logger.info("cal.get(Calendar.HOUR_OF_DAY) :: " + cal.get(Calendar.HOUR_OF_DAY));

        logger.info("cal.get(Calendar.MINUTE) :: " + cal.get(Calendar.MINUTE));

        logger.info("cal.get(Calendar.SECOND) :: " + cal.get(Calendar.SECOND));
    }

    public void getCalcDate(){
        int CALC_NUM = 1;

        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd HH-mm-ss");
        logger.info("sdf2.format(cal.getTime()) :: " + sdf2.format(cal.getTime()));
        cal.add(Calendar.YEAR, CALC_NUM*-1);
        logger.info("NOW() - CALC_YEAR :: " + sdf2.format(cal.getTime()));

        cal.add(Calendar.MONTH, CALC_NUM*-1);
        logger.info("NOW() - CALC_MONTH :: " + sdf2.format(cal.getTime()));

        cal.add(Calendar.DATE, CALC_NUM*-1);
        logger.info("NOW() - CALC_DATE :: " + sdf2.format(cal.getTime()));

        cal.add(Calendar.HOUR_OF_DAY, CALC_NUM*-1);
        logger.info("NOW() - CALC_HOUR_OF_DAY :: " + sdf2.format(cal.getTime()));

        cal.add(Calendar.MINUTE, CALC_NUM*-1);
        logger.info("NOW() - CALC_MINUTE :: " + sdf2.format(cal.getTime()));

        cal.add(Calendar.SECOND, CALC_NUM*-1);
        logger.info("NOW() - CALC_SECOND :: " + sdf2.format(cal.getTime()));
    }
}