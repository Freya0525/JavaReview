package com.bryea.javaSe.Thread01;

/**
 * ClassName: ThreadDemo
 * Package: com.atguigu.javaSe.Thread
 * Description:
 *
 * @Author Freya
 * @Create 2025/2/7 16:59
 * @Version 1.0
 */
/*
* 线程创建方式一 ： 用Thread类创建线程
* */
public class ThreadDemo extends Thread{
    //重写run方法 : Ctrl + O
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("偶数 = " + i);
        }

    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();//启动线程
        for (int i = 0; i < 100; i+=2) {
            System.out.println("奇数 = " + i);
        }
    }
}
