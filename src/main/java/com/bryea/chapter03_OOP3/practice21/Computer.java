package com.bryea.chapter03_OOP3.practice21;

/**
 * ClassName: Computer
 * Package: com.atguigu.chapter03_OOP.practice20
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/24
 */
/*
注意：
1. 如果接口的实现类是非抽象类，那么必须`重写接口中所有抽象方法`。
2. 默认方法可以选择保留，也可以重写。
   > 重写时，default单词就不要再写了，它只用于在接口中表示默认方法，到类中就没有默认方法的概念了
3. 接口中的静态方法不能被继承也不能被重写
 */
public class Computer {
    //静态共享方法
    public static void show(USB usb){
        usb.start();
        System.out.println("=========== USB 设备工作 ========");
        usb.stop();
    }

}
