package com.bryea.javaSe.Thread01;

/**
 * ClassName: TreadApi1
 * Package: com.atguigu.javaSe.Thread
 * Description:
 *
 * @Author Freya
 * @Create 2025/2/8 17:19
 * @Version 1.0
 */
//1.Thread API 获取线程名
public class TreadApi1  {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("thread = " + thread); //main线程默认thread = Thread[main,5,main]

        new Thread(){
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println("name = " + name);

            }
        }.start();
    }
}
