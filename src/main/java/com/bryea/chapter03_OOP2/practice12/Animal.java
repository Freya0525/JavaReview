package com.bryea.chapter03_OOP2.practice12;

/**
 * ClassName: Animal
 * Package: com.atguigu.chapter03_OOP.practice11
 * Description:面向对象特征之二：继承
 *
 * @Author Freya
 * @Create 2026/7/19
 */
/*
定义动物类Animal,做为父类
 */
public class Animal {
    //定义name属性
    String name;
    //定义age属性
    int age;

    //定义动物的吃东西方法
    public void eat(){
        System.out.println(age+"岁的"+name+"在吃东西");
    }
}
