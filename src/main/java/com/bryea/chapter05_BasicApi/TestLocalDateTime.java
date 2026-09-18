package com.bryea.chapter05_BasicApi;

import org.junit.Test;

import java.time.LocalDateTime;

/**
 * ClassName: TestLocalDateTime
 * Package: com.bryea.chapter05_BasicApi
 * Description:
 *
 * @Author Freya
 * @Create 2026/9/18
 */
public class TestLocalDateTime {
    @Test
    public void test1() {
        //1.获取当前时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        //2.指定日期
        LocalDateTime localDateTime = LocalDateTime.of(2054, 10, 1, 14, 30, 20);
        System.out.println("localDateTime = " + localDateTime);

    }
}
