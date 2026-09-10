package com.bryea.chapter03_OOP3.practice21;

/**
 * ClassName: Flash
 * Package: com.atguigu.chapter03_OOP.practice20
 * Description: USB接口的实现类
 *
 * @Author Freya
 * @Create 2026/7/24
 */
public class Flash implements USB{
    @Override
    public void start() {
        System.out.println("u盘开始读取");
    }

    @Override
    public void stop() {
        System.out.println("u盘读取完毕");
    }
}
