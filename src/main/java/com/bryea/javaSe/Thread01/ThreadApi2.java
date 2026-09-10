package com.bryea.javaSe.Thread01;

/**
 * ClassName: ThreadApi2
 * Package: com.atguigu.javaSe.Thread01
 * Description:
 *
 * @Author Freya
 * @Create 2025/2/10 19:14
 * @Version 1.0
 */
public class ThreadApi2 extends Thread{
    @Override
    public void run() {
        System.out.println("我是" +getName() + "线程" );
    }

    public static void main(String[] args) {
        ThreadApi2 t= new ThreadApi2();
        t.start();



        Thread thread = Thread.currentThread();
        System.out.println("主线程的名称 = " + thread.getName());
    }
}
