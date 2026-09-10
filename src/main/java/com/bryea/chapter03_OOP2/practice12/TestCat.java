package com.bryea.chapter03_OOP2.practice12;

/**
 * ClassName: TestCat
 * Package: com.atguigu.chapter03_OOP.practice11
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/19
 */
public class TestCat {
    public static void main(String[] args) {
        //创建一个猫类对象
        Cat cat = new Cat();
        //为该猫类对象的name属性进行赋值
        cat.name="Tom";
        cat.age= 2;
        cat.eat();
        cat.catchMouse();
        cat.catchMouse();
        cat.catchMouse();
    }
}
