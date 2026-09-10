package com.bryea.chapter03_OOP3.practice17;

/**
 * ClassName: Eunuch
 * Package: com.atguigu.chapter03_OOP.practice16
 * Description: final类
 *
 * @Author Freya
 * @Create 2026/7/24
 */
public final class Eunuch {

    final int age = 18;
    public void testMethod(){
        System.out.println("final类里的普通方法");
    }
}
//class Son extends Eunuch{} //报错，final类不能被继承
