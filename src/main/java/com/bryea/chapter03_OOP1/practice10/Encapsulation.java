package com.bryea.chapter03_OOP1.practice10;

/**
 * ClassName: Person
 * Package: com.atguigu.chapter03_OOP.practice9
 * Description:面向对象特征之一：封装性
 *
 * @Author Freya
 * @Create 2026/7/15
 */

/**
 * java通过修饰符控制类或成员的可见性范围从而实现封装性。
 * Java 提供了 4 种访问权限，从最严格到最开放：
 * private → 缺省(default) → protected → public
 * 如下：
 * Person 中的成员，可以被哪些地方访问？
 */
public class Encapsulation {

    //private修饰只能在当前类内部访问
    private String name;

    //缺省，当前类+同一个包中的其他类都能访问。
    int age;

    //protected:同包+其他包的子类
    protected char gender;

    //public 哪里都可以访问
    //本类内部        ✅
    //同一个包        ✅
    //其他包的子类    ✅
    //其他包的普通类  ✅
    public double salary;

    public void test(){
        System.out.println(name);
    }

}
