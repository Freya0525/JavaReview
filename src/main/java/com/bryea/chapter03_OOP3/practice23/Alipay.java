package com.bryea.chapter03_OOP3.practice23;



/**
 * ClassName: Alipay
 * Package: com.atguigu.chapter03_OOP.practice22
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/30
 */
public class Alipay implements Payment {
    @Override
    public void pay(double mount) {
        System.out.println("支付宝支付"+mount+"元");
    }
}
