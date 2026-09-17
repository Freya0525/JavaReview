package com.bryea.chapter05_BasicApi;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * ClassName: TestBigDecimal
 * Package: com.bryea.chapter05_BasicApi
 * Description:BigDecimal
 *
 * @Author Freya
 * @Create 2026/9/17
 */
public class TestBigDecimal {
    public static void main(String[] args) {
        //BigDecimal是java提供的数学工具类，需要创建对象再使用
        //1.创建对象
        BigDecimal a = new BigDecimal("10.5");
        BigDecimal b = new BigDecimal(2.5);

        //2.加减乘运算
        BigDecimal add = a.add(b);
        BigDecimal subtract = a.subtract(b);
        BigDecimal multiply = a.multiply(b);

        //3.除法的使用方式特殊
        BigDecimal c  = new BigDecimal("10");
        BigDecimal d  = new BigDecimal("3");

//        BigDecimal divide = c.divide(d);
       // System.out.println("divide = " + divide); //ArithmeticException
        //结果是3.333333333333333333…… 是一个无限循环小数
        //BigDecimal 不知道应该保留多少位，也不知道应该怎么舍入，所以会抛出：ArithmeticException
        /*
        因此，遇到可能除不尽的情况，需要明确告诉它：保留几位小数；使用什么舍入方式。
        BigDecimal result = a.divide(b, 2, RoundingMode.HALF_UP);
        含义是：
        a ÷ b
        保留2位小数
        使用四舍五入
         */
        BigDecimal divide1 = c.divide(d, 2, RoundingMode.HALF_UP);
        System.out.println("divide1 = " + divide1); //3.33


        //BigDecimal 如何比较大小？
        BigDecimal e = new BigDecimal("10.0");
        BigDecimal f = new BigDecimal("10.00");

        System.out.println(e == f); // false
        int compare = e.compareTo(b);
        System.out.println("compare = " + compare); //1

        BigDecimal g = new BigDecimal("15.999999999999");
        BigDecimal h = new BigDecimal("10.000123");
        int compare1 = g.compareTo(h);
        System.out.println("compare1 = " + compare1);//1


        /*
        compareTo() 返回值的含义
        不要把 1 理解成计算结果。它是一个“比较结果标记”：
        g.compareTo(h) < 0   // g 小于 h
        g.compareTo(h) == 0  // g 等于 h
        g.compareTo(h) > 0   // g 大于 h
        通常可以简单记成：
        返回结果	含义
        负数（通常是 -1）	前面小于后面
        0	前面等于后面
        正数（通常是 1）	前面大于后面
         */
    }
}

