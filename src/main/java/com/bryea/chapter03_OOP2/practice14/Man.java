package com.bryea.chapter03_OOP2.practice14;

/**
 * ClassName: Man
 * Package: com.atguigu.chapter03_OOP.practice13
 * Description:
 *
 * @Author Freya
 * @Create 2026/8/4
 */
public class Man extends Person{
    boolean isSmoking;

    @Override
    public void eat() {
        System.out.println("男人多吃肉");
    }

    @Override
    public void walk() {
        System.out.println("男人笔挺走路");
    }

    public void earnMoney(){
        System.out.println("男人挣钱养家");
    }


}
