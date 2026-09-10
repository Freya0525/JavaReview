package com.bryea.chapter03_OOP3.practice16;

/**
 * ClassName: Singleton
 * Package: com.atguigu.chapter03_OOP.practice15
 * Description:类的单例模式：饿汉式
 *
 * @Author Freya
 * @Create 2026/7/22
 */
public class Singleton {
    //1.私有化构造器 --> 作用是禁止外部new对象
    private Singleton(){

    }
    //2.内部提供一个当前类的实例

    //4.此实例也必须静态化
    /*
    那么禁止别人new对象，那么对象从哪里来？
    所以需要在类内部提供一个当前类的实例
    那么private static Singleton s = new Singleton();的作用是
    在类内部保存唯一的那个对象。
    加static相当于这个实例对于整个类共享。
    如果不加static:private Singleton singleton;它属于对象
     */
    private static Singleton s = new Singleton(); //作用是：在类内部保存唯一的那个对象。

    //3.提供公共的静态方法，返回当前类的对象
    public static Singleton getInstance(){
        return s;
    }



}

