package com.bryea.chapter03_OOP3.practice17;

/**
 * ClassName: TestFinal
 * Package: com.atguigu.chapter03_OOP.practice16
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/24
 */
public class TestFinal {
    public static void main(String[] args) {
        Eunuch eunuch = new Eunuch();
        eunuch.testMethod();
        //eunuch.age=13;//报错，Cannot assign a value to final variable 'age';
        //final修饰的变量只能赋值一次，不能重新赋值。


    }
}
