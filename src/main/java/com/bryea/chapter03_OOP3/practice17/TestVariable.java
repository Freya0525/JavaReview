package com.bryea.chapter03_OOP3.practice17;

/**
 * ClassName: TestVariable
 * Package: com.atguigu.chapter03_OOP.practice16
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/24
 */
public final class TestVariable {
    public static int totalNumber = 5;
    public final int ID;


    /**
     * final变量的赋值方式之一：构造器赋值
     * 方式1：声明时赋值
     * final int age = 18;
     * 方式2：代码块赋值
     * final int age;
     * {
     *     age = 18;
     * }
     * 方式3：构造器赋值（最常见）
     * 如下：
     */
    public TestVariable(){ //构造器赋值
        ID = ++totalNumber;
    }

    public static void main(String[] args) {
        TestVariable t = new TestVariable();
        System.out.println(t.ID);
    }

}
