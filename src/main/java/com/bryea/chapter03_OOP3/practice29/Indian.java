package com.bryea.chapter03_OOP3.practice29;

/**
 * ClassName: Indian
 * Package: com.atguigu.chapter03_OOP.practice28
 * Description:
 *
 * @Author Freya
 * @Create 2026/8/4
 */
/*
4、声明实现类印度人Indian，重写抽象方法，打印用手抓饭
 */
public class Indian implements Eatable{
    @Override
    public void eat() {
        System.out.println("印度人用手吃抓饭");
    }
}
