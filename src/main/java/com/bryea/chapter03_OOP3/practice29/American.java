package com.bryea.chapter03_OOP3.practice29;

/**
 * ClassName: American
 * Package: com.atguigu.chapter03_OOP.practice28
 * Description:
 *
 * @Author Freya
 * @Create 2026/8/4
 */
/*
3、声明实现类美国人American，重写抽象方法，打印用刀叉吃饭
 */
public class American implements Eatable{
    @Override
    public void eat() {
        System.out.println("用叉刀吃饭");
    }
}
