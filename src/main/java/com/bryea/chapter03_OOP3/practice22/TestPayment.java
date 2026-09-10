package com.bryea.chapter03_OOP3.practice22;

/**
 * ClassName: TestPayment
 * Package: com.atguigu.chapter03_OOP.practice21
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/30
 */
public class TestPayment {
    public static void main(String[] args) {
        Payment payment = new AliPayment();
        //变量的声明类型是接口，实际对象是实现类。这就是接口多态
        payment.pay(100);

    }
}
