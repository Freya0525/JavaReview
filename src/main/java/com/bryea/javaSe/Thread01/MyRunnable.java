package com.bryea.javaSe.Thread01;

/**
 * ClassName: MyRunnable
 * Package: com.atguigu.javaSe.Thread
 * Description:
 *
 * @Author Freya
 * @Create 2025/2/7 17:25
 * @Version 1.0
 */

/*
* 线程传播关键方式二： 用Runnable接口创建线程
* */
public class MyRunnable implements Runnable{
    //重写接口抽象方法 ：Ctrl + I
    //需求：在这个线程体中需要完成打印1-100的偶数
    @Override
    public void run() {
        for (int i = 0; i < 100; i+=2) {
            System.out.println("偶数even = " + i);
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
//        myRunnable.start();//报错，因为MyRunnable类没有定义start方法，父接口Runnable也没有start方法

        //我们知道Thread类有start方法，所以我们要借助Thread类的start方法来启动线程
        Thread t = new Thread(myRunnable);//myRunnable作为实参传给Thread类的构造器
                                        //myRunnable实参的作用是给Thread类对象的一个属性target赋值，这个target是Runnable类型的
        t.start();
        //本质上这里启动的是t线程，但是t线程启动后，JVM会调用t对象的run方法。又调用了target的run方法
        //JVM调用t的run方法，然后t又调用target(就是myRunnable)的run方法，其实这里隐含了一个代理模式，t是代理对象，myRunnable是被代理对象

        //完成打印1-100的奇数
        for(int i=1; i<=100; i+=2){
            System.out.println("奇数odd：" + i);
        }
    }
}
