package com.bryea.chapter03_OOP3.practice21;

/**
 * ClassName: InterfaceDemo
 * Package: com.atguigu.chapter03_OOP.practice20
 * Description: 测试USB接口
 *
 * @Author Freya
 * @Create 2026/7/24
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Computer.show(new Flash()); //因为show方法接受USB类型的对象变量
        System.out.println();
        Computer.show(new Print());
        System.out.println(
        );
        Computer.show(new USB() {
            @Override
            public void start() {
                System.out.println("移动硬盘开始读取");
            }

            @Override
            public void stop() {
                System.out.println("移动硬盘结束读取");
            }
        });
    }
}
