package com.bryea.chapter03_OOP2.practice13;

/**
 * ClassName: Phone
 * Package: com.atguigu.chapter03_OOP.practice12
 * Description:方法重写(override)
 *
 * @Author Freya
 * @Create 2026/7/19
 */
/*
方法重写举例
比如新的手机增加来电显示头像的功能，代码如下：
 */
public class Phone {
    public void sendMessage(){
        System.out.println("发短信");
    }
    public void call(){
        System.out.println("打电话");
    }
    public void showNum(){
        System.out.println("来电显示号码");
    }
}
