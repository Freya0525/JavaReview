package com.bryea.chapter03_OOP1.practice11;

/**
 * ClassName: TriAngle
 * Package: com.atguigu.chapter03_OOP.practice10
 * Description:类的成员之三：构造器
 *
 * @Author Freya
 * @Create 2026/7/18
 */

/**
 * 练习1：编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，同时
 * 声明公共方法访问私有变量。此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形
 * 的面积。
 */
public class TriAngle {
    private int base;
    private int height;
    //无参构造
    public TriAngle(){};

    //有参构造
    public TriAngle(int a ,int b ){
        base = a;
        height = b;
    }
    //getter方法
    public int getBase(){
        return base;
    }
    //setter方法
    public void setBase(int a ){
        base = a;
    }

    //getter方法
    public int getHeight(){
        return height;
    }
    //setter方法
    public void setHeight(int b ){
        height = b;
    }

    public String getInfo(){
        return "长=" + base + "， 高="+height;
    }
}
