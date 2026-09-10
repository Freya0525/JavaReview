package com.bryea.chapter03_OOP3.practice28;

/**
 * ClassName: ComparableCircle
 * Package: com.atguigu.chapter03_OOP.practice27
 * Description:
 *
 * @Author Freya
 * @Create 2026/8/4
 */
/*
定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。
在ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半径大小。
 */
public class ComparableCircle extends Circle implements CompareObject {
    @Override
    public int compareTo(Object o) {
        ComparableCircle c = (ComparableCircle)o;
        double r = c.getRadius();
        return 0;
    }
}
/*
ComparableCircle c1 = new ComparableCircle(5);
ComparableCircle c2 = new ComparableCircle(10);

c1.compareTo(c2);
那么：

当前对象：c1
传入的对象：c2
方法里面：
this 指向 c1
o 指向 c2
接下来我们要比较c1.radius 和c2。radius
 */