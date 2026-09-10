package com.bryea.javaSe.singleton;/**
 * ClassName: TestSingleton2
 * Package: com.atguigu.javaSe.singleton
 * Description:
 *
 * @Author Freya
 * @since 2025/4/20
 */

/**
 * @author Freya
 * @since 2025/4/20
 */

public class TestSingleton2 {
    static SingleFour s1;
    static SingleFour s2;

    public static void main(String[] args) {
        Thread t1=new Thread(){
            @Override
            public void run(){
                s1 = SingleFour.getInstance();
            }
        };


        Thread t2=new Thread(){
            @Override
            public void run() {
                SingleFour s2 = SingleFour.getInstance();

            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();//当前线程会等待线程 t1 执行完成（即死亡）之后，才会继续往下执行。
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println(s1==s2);
        //有线程安全问题
        //一个线程判断完instance==null还没来得及new对象，另一个线程又给判断null了，这样的话就会有两次实例化，是s1不等于s2
    }
}
