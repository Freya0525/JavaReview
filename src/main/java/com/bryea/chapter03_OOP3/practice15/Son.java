package com.bryea.chapter03_OOP3.practice15;

/**
 * ClassName: Son
 * Package: com.atguigu.chapter03_OOP.practice14
 * Description:Son继承父亲
 *
 * @Author Freya
 * @Create 2026/7/22
 */
public class Son extends Father{

   // @overrride//尝试重写静态方法，加上@override编译报错，去掉
    //override不报错，但是也不是重写。
    //static修饰的静态方法是不能被重写的
    public static void fun(){
        System.out.println("Son.fun");
    }

}
