package com.bryea.chapter03_OOP3.practice24;

/**
 * ClassName: C
 * Package: com.atguigu.chapter03_OOP.practice23
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/30
 */
public class C implements A,B{
    @Override
    public void showA() {
        System.out.println("showA");
    }

    @Override
    public void showB() {
        System.out.println("showB");
    }
}
