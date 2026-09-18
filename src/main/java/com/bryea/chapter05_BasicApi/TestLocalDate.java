package com.bryea.chapter05_BasicApi;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;

/**
 * ClassName: TestLocalDate
 * Package: com.bryea.chapter05_BasicApi
 * Description:
 *
 * @Author Freya
 * @Create 2026/9/18
 */
public class TestLocalDate {
    @Test
    public void test1() {
        //1.获取当前日期
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        /*
        public static LocalDate now() {
        return now(Clock.systemDefaultZone());
        }
        now()是静态方法，所以可以直接通过类名调用。

         */


        //2. 创建指定日期
        //使用LocalDate.of(年, 月, 日)
        LocalDate date  = LocalDate.of(2026, 6, 2);
        System.out.println("date = " + date);

        //3. 获取年月日
        int year = date.getYear();
        int monthValue = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println("year = " + year);
        System.out.println("monthValue = " + monthValue);
        System.out.println("dayOfMonth = " + dayOfMonth);
        System.out.println("dayOfWeek = " + dayOfWeek);

        //4. LocalDate 是不可变对象
        LocalDate date1 = LocalDate.of(2035, 5, 25);
        date1.plusDays(3);
        System.out.println("date1 = " + date1); //date1还是2035年5月25日，plusDays不会改变原对象。

    }

}
