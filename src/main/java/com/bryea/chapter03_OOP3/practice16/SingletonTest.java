package com.bryea.chapter03_OOP3.practice16;

/**
 * ClassName: SingletonTest
 * Package: com.atguigu.chapter03_OOP.practice15
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/22
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
