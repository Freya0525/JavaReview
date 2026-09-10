package com.bryea.chapter03_OOP3.practice29;

/**
 * ClassName: EatableTest
 * Package: com.atguigu.chapter03_OOP.practice28
 * Description:
 *
 * @Author Freya
 * @Create 2026/8/4
 */
/*
5、声明测试类EatableTest，创建Eatable数组，存储各国人对象，并遍历数组，
调用eat()方法
 */
public class EatableTest {
    public static void main(String[] args) {
        //创建Eatable数组，
        Eatable[] eatables = new Eatable[3];
        //存储各国人对象
        eatables[0]=new American();
        eatables[1] = new Indian();
        eatables[2]=new Chinese();
        //并遍历数组
        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();
        }
    }
}
