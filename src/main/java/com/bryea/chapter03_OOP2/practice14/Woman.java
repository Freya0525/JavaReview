package com.bryea.chapter03_OOP2.practice14;

/**
 * ClassName: Woman
 * Package: com.atguigu.chapter03_OOP.practice13
 * Description:
 *
 * @Author Freya
 * @Create 2026/8/4
 */
public class Woman extends Person{
    boolean isBeauty;



    @Override
    public void eat() {
        System.out.println("女人应该少吃，减肥");
    }

    @Override
    public void walk() {
        System.out.println("女人窈窕的走路");
    }
    public void goShopping(){
        System.out.println("女人喜欢逛街。。。");
    }
}
