package com.bryea.chapter03_OOP3.practice25;

/**
 * ClassName: TypeCConverter
 * Package: com.atguigu.chapter03_OOP.practice24
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/31
 */
public class TypeCConverter implements USBC{
    @Override
    public void charge() {
        System.out.println("正在充电");
    }

    @Override
    public void in() {
        System.out.println("正在接受数据");

    }

    @Override
    public void out() {
        System.out.println("正在输出数据");
    }

    @Override
    public void reverse() {
        System.out.println("正在反转数据");
    }
}
