package com.bryea.chapter03_OOP2.practice12;

/**
 * ClassName: PersonTest
 * Package: com.atguigu.chapter03_OOP.practice11
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/19
 */
public class PersonTest {
    public static void main(String[] args) {
        Person freya = new Person("freya", 12);
        System.out.println("姓名："+freya.getName()+", 年龄："+freya.getAge());

    }
}
