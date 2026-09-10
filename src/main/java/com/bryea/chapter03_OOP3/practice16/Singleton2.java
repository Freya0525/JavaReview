package com.bryea.chapter03_OOP3.practice16;

/**
 * ClassName: Singleton2
 * Package: com.atguigu.chapter03_OOP.practice15
 * Description:类的单例模式：懒汉式
 *
 * @Author Freya
 * @Create 2026/7/22
 */
public class Singleton2 {
    //1.私有化构造器
    private Singleton2(){

    }
    //2.内部提供一个当前类的实例
    //4.此实例也必须静态化
    private static Singleton2 singleton;

    //3.提供公共的静态方法，返回当前类的对象
    public static Singleton2 getInstance(){
        if(singleton ==null){
            singleton = new Singleton2();
        }
        return singleton;
    }



}
