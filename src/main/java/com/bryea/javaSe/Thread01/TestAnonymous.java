package com.bryea.javaSe.Thread01;

/**
 * ClassName: TestAnonymous
 * Package: com.atguigu.javaSe.Thread
 * Description:
 *
 * @Author Freya
 * @Create 2025/2/7 19:53
 * @Version 1.0
 */
//三 ： 用匿名内部类创建线程
public class TestAnonymous {
    public static void main(String[] args) {
        //匿名内部类
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i+=2) {
                    System.out.println("用Thread类创建的线程：" + i);
                }
            }
        }.start();
        //Thread类的匿名子类对象.start();


        //用Runnable创建
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i+=3) {
                    System.out.println("用Runnable接口创建扽线程：" + i);
                }
            }
        }).start();

        for(char c ='a'; c<='z'; c++){
            System.out.println("mian线程：" + c);
        }
        //上面的代码有3个线程，（1）打印偶数的线程（2）打印奇数的线程（3）主线程，它们同时执行
    }
}
