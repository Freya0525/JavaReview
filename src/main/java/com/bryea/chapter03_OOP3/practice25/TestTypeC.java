package com.bryea.chapter03_OOP3.practice25;

/**
 * ClassName: TestTypeC
 * Package: com.atguigu.chapter03_OOP.practice24
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/31
 */
public class TestTypeC {
    public static void main(String[] args) {
        //1.创建实现类对象
        TypeCConverter typeCConverter = new TypeCConverter();
        typeCConverter.reverse();
        typeCConverter.in();
        typeCConverter.out();
        typeCConverter.charge();
    }
}
