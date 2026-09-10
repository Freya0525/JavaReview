package com.bryea.chapter03_OOP3.practice21;

/**
 * ClassName: Print
 * Package: com.atguigu.chapter03_OOP.practice20
 * Description: USB接口的实现类
 *
 * @Author Freya
 * @Create 2026/7/24
 */
public class Print implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
