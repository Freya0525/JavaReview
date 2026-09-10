package com.bryea.chapter03_OOP3.practice28;

/**
 * ClassName: Circle
 * Package: com.atguigu.chapter03_OOP.practice27
 * Description:
 *
 * @Author Freya
 * @Create 2026/8/3
 */
/*
定义一个Circle类，声明radius属性，提供getter和setter方法
 */
public class Circle {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){}

    public double getRadius(){
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
