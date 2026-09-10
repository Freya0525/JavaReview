package com.bryea.chapter03_OOP1.practice11;

/**
 * ClassName: TriAngleTest
 * Package: com.atguigu.chapter03_OOP.practice10
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/18
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle(6, 10);
        System.out.println("三角形的" + triAngle.getInfo());

        System.out.println("面积= " + (0.5*triAngle.getBase()*triAngle.getHeight()));
    }
}
