package com.bryea.chapter03_OOP1.practice7;

/**
 * ClassName: overloadTest
 * Package: com.atguigu.chapter03_OOP.oop.practice7
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/14
 */
public class overloadTest {
    public static void main(String[] args) {
        /**
         * 练习2：编写程序，定义三个重载方法并调用
         * 方法名为mOL。
         * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，相
         * 乘并输出结果，输出字符串信息。
         * 在主类的main ()方法中分别用参数区别调用三个方法
         */
        MethodTest m1 = new MethodTest();
        m1.mOL(4);
        m1.mOL(5,6);
        m1.mOL("Freya");

    }

}
