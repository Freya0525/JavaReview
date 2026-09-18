package com.bryea.chapter05_BasicApi;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * ClassName: TestSimpleDateFormat
 * Package: com.bryea.chapter05_BasicApi
 * Description:
 *
 * @Author Freya
 * @Create 2026/9/18
 */
public class TestSimpleDateFormat {
    @Test
    public void test1() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //创建当前时间对象
        Date date = new Date();
        //把当前时间转换成字符串格式
        String format = simpleDateFormat.format(date);
        System.out.println("format = " + format);
    }
    @Test
    public void test2() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String time = "2026-01-01 12:12:12";
        Date date = simpleDateFormat.parse(time);
        System.out.println("date = " + date);
    }
}
