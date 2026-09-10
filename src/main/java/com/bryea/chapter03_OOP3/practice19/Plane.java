package com.bryea.chapter03_OOP3.practice19;

/**
 * ClassName: Plane
 * Package: com.atguigu.chapter03_OOP.practice18
 * Description: Fly接口的实现类
 *
 * @Author Freya
 * @Create 2026/7/24
 */
public class Plane implements Fly{
    @Override
    public void fly() {
        System.out.println("飞机用发动机飞");
    }
}
