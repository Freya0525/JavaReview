package com.bryea.chapter03_OOP3.practice29;

/**
 * ClassName: Chinese
 * Package: com.atguigu.chapter03_OOP.practice28
 * Description:
 *
 * @Author Freya
 * @Create 2026/8/4
 */
/*
2、声明实现类中国人Chinese，重写抽象方法，打印用筷子吃饭
 */
public class Chinese implements Eatable{
    @Override
    public void eat() {
        System.out.println("用筷子吃饭");
    }
}


