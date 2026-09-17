package com.bryea.chapter05_BasicApi;

import org.junit.Test;
import org.w3c.dom.CDATASection;

import java.util.Date;

/**
 * ClassName: TestDateApi
 * Package: com.bryea.chapter05_BasicApi
 * Description:Date日期类
 *
 * @Author Freya
 * @Create 2026/9/17
 */
/*
Date() -> 根据当前系统时间创建Date对象
Date(long time) -> 根据指定的时间来创建Date对象 -> 传递毫秒值 -> 时间从时间原点开始算起
 */
public class TestDateApi {
    public static void main(String[] args) {
        //Date 是 Java 用来表示某个时间点的类，完整类名是：java.util.Date
        //例如现在是：2026年9月17日 15:30:00
        //这个具体时刻就可以用一个 Date 对象表示：
        Date date = new Date();
        System.out.println("date = " + date);
        /*
        每次运行程序，结果都可能不同，因为：
        new Date()
        获取的是创建对象时的当前系统时间。
        可以这样理解：
        执行 new Date() 的一瞬间，Java 给当前时间拍了一张快照。
         */
    }

    
    @Test
    public void test1() {
        Date date = new Date();
        System.out.println("date = " + date);

        System.out.println("-----------");
        Date date1 = new Date(1000L); //表示时间原点之后 1 秒。
        System.out.println("date1 = " + date1);
        Date date2 = new Date(60 * 60 * 1000L);//表示时间原点之后 1 分钟。
        Date date3 = new Date(24 * 60 * 60 * 1000L);
        System.out.println("date2 = " + date2);//表示原点之后1天
        //new Date(1000L) 中的 1000L 是时间戳，表示距离 1970 年时间原点 1000 毫秒，也就是时间原点之后 1 秒。
    }
    
    @Test
    public void test2() {
        Date date = new Date();
        date.setTime(0L);
        System.out.println("date = " + date);
        /*
        一开始 date 表示当前时间，调用：
        date.setTime(0L);
        之后，它改为表示时间原点。
         */


        System.out.println("-----------");
        Date date1 = new Date();
        long time = date1.getTime();
        //getTime() 会计算：date1表示的时间 到 1970年1月1日00:00:00 UTC相差的毫秒数。
        System.out.println("time = " + time);


    }
    

}
