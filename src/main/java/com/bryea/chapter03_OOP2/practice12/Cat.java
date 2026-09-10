package com.bryea.chapter03_OOP2.practice12;

/**
 * ClassName: Cat
 * Package: com.atguigu.chapter03_OOP.practice11
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/19
 */
/*
定义动物类Animal，作为父类
 */
public class Cat extends Animal{
    int count;//记录每只猫抓老鼠的数量

    //定义一个猫抓老鼠的方法catchMouse
    public void catchMouse(){
        count++;
        System.out.println("抓老鼠，已经抓了"+count+"只老鼠");
    }

}
