package com.bryea.chapter05_BasicApi;

import org.junit.Test;

import java.util.Calendar;

/**
 * ClassName: TestCalendar
 * Package: com.bryea.chapter05_BasicApi
 * Description:第五章.Calendar日历类
 *
 * @Author Freya
 * @Create 2026/9/17
 */
public class TestCalendar {
    /*
    Calendar类 -- >
    它是抽象类，不能直接 new Calendar()，需要这样获取对象：
    Calendar calendar = Calendar.getInstance();
     */
    @Test
    public void test1() {
        //1.获取calendar对象
        Calendar instance = Calendar.getInstance();
        System.out.println("instance = " + instance);

        //2.2. 获取日期字段：get()
        //int value = calendar.get(字段);
        /*
        常用字段：
        Calendar.YEAR          // 年
        Calendar.MONTH         // 月
        Calendar.DAY_OF_MONTH  // 一个月中的第几天
        Calendar.DAY_OF_WEEK   // 一周中的第几天
        Calendar.HOUR          // 12小时制
        Calendar.HOUR_OF_DAY   // 24小时制
        Calendar.MINUTE        // 分钟
        Calendar.SECOND        // 秒
         */
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH);
        int dayOfMonth = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println("year = " + year);
        System.out.println("month = " + month); //返回8，而现在是9月份，是因为Calendar的月份从0开始。所以返回8就是表示9月份
        System.out.println("dayOfMonth = " + dayOfMonth);

        //3.修改日期字段：set()
        Calendar instance1 = Calendar.getInstance();
        instance1.set(Calendar.YEAR,2030);
        instance1.set(Calendar.MONTH,10);
        instance1.set(Calendar.DAY_OF_MONTH,3);
        System.out.println("instance1 = " + instance1);

        instance1.set(2035,5,25);
        System.out.println("instance1 = " + instance1);







    }
    @Test
    public void test() {
        //4.日期偏移：add()
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH,3);
        //表示在当前日期基础上添加3天
        System.out.println("calendar = " + calendar);
        calendar.add(Calendar.YEAR,1);
        //表示在当前日期基础上增加1年
        System.out.println("calendar = " + calendar);

        calendar.add(Calendar.MONTH,-2);
        ////表示在当前日期基础上减少一个月
        System.out.println("calendar = " + calendar);

        //正数向后偏移，负数向前偏移。
    }
}
