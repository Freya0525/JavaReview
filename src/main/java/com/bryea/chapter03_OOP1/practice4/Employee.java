package com.bryea.chapter03_OOP1.practice4;

/**
 * ClassName: Employee
 * Package: com.atguigu.chapter03_OOP.oop.practice4
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/13
 */
 /*
    案例：将属性测试的exer1种关于员工信息的输出内容放到方法中。通过调用方法显示。
*/
public class Employee {
    int id;
    String name;
    int age;
    double salary;

    //定义一个方法,用于显示员工的属性信息
    public void show() {
        System.out.println("e1.name = " + name + ", e1.id=" + id +
                ", e1.age=" + age + ", e1.salary=" + salary
        );
    }

    public String show1() {
       return "show1:e1.name = " + name + ", e1.id=" + id +
                ", e1.age=" + age + ", e1.salary=" + salary
        ;
    }
}