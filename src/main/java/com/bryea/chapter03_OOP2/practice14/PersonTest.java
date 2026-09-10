package com.bryea.chapter03_OOP2.practice14;

/**
 * ClassName: PersonTest
 * Package: com.atguigu.chapter03_OOP.practice13
 * Description: 测试多态
 *
 * @Author Freya
 * @Create 2026/8/4
 */
public class PersonTest {
    public static void main(String[] args) {
        //多态性之前的场景
        Person freya = new Person();
        Man oliver = new Man();

        //多态性：子类对象的多态性
        Person man = new Man();


        /*
        多态性的应用：虚拟方法调用
        在多态的场景下，调用方法时。
        编译时：认为方法是左边声明的父类类型的方法（即被重写的方法）
        执行时：实际执行的是子类重写父类的方法
         */
        man.eat();
        man.walk();
    }
}
