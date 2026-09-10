package com.bryea.chapter03_OOP2.practice13;

/**
 * ClassName: TestOverride
 * Package: com.atguigu.chapter03_OOP.practice12
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/19
 */
public class TestOverride {
    public static void main(String[] args) {
        //创建子类对象
        SmartPhone smartPhone = new SmartPhone();
        //调用父类继承下来的方法
        smartPhone.sendMessage();
        //调用父类继承下来，子类重写的方法
        smartPhone.call();
        smartPhone.showNum();
    }
}
