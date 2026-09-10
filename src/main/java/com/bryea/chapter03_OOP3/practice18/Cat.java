package com.bryea.chapter03_OOP3.practice18;

/**
 * ClassName: Cat
 * Package: com.atguigu.chapter03_OOP.practice16
 * Description:抽象类的子类
 *
 * @Author Freya
 * @Create 2026/7/22
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("小猫吃鱼和猫粮");
    }
}
