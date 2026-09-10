package com.bryea.chapter03_OOP3.practice20;

/**
 * 接口
 */
public interface Payment {
    int mount = 1000;
    //这里的成员变量int mount = 1000;等价于public static final int mount = 1000;

    void pay();
}
