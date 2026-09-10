package com.bryea.chapter03_OOP3.practice15;

/**
 * ClassName: TestStaticMethod
 * Package: com.atguigu.chapter03_OOP.practice14
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/22
 */
public class TestStaticMethod {
    public static void main(String[] args) {
        Father.method();
        Son.method();//Son类没有method方法所以它调用的是父类继承下来的Father.method
        Son.fun();//Son.fun

        Father f = new Son();
        f.method();//输出Father.method，static看左边类型
    }
}
