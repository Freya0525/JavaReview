package com.bryea.chapter05_BasicApi;

import java.math.BigInteger;

/**
 * ClassName: TestBigInteger
 * Package: com.bryea.chapter05_BasicApi
 * Description:BigInteger
 *
 * @Author Freya
 * @Create 2026/9/17
 */
public class TestBigInteger {
    public static void main(String[] args) {
        //创建对象
        BigInteger number = new BigInteger("12345678901234567890");//number 是保存该对象地址的引用变量。
        //数字必须写成字符串，不能直接写成数字
        //写成new BigInteger(12345678901234567890)是不对的。

        //四则运算
        //BigInteger是类，先创建对象，再调用对象的方法来实现运算。
        BigInteger a = new BigInteger("100");
        BigInteger b = new BigInteger("20");

        BigInteger sum = a.add(b); //120
        BigInteger subtract = a.subtract(b); //80
        BigInteger multiply = a.multiply(b);  //2000
        BigInteger divide = a.divide(b); //5

        System.out.println("sum = " + sum);
        System.out.println("subtract = " + subtract);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("a = " + a); //100 因为a是BigInteger 对象本身不可变，我们做运算时至调用了对象的方法，而对象本身的值是不会变的。
        System.out.println("b = " + b); //20
    }
}
