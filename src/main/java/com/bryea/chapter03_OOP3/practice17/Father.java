package com.bryea.chapter03_OOP3.practice17;

/**
 * ClassName: Father
 * Package: com.atguigu.chapter03_OOP.practice16
 * Description: final方法
 *
 * @Author Freya
 * @Create 2026/7/24
 */
public class Father {
    public final void method(){
        System.out.println("father");
    }

}
class Son extends Father{
//    public void method(){
//        System.out.println("son");
//    }
    //报错是因为，父类的方法被final修饰后子类不能重写。
}

