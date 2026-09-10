package com.bryea.chapter03_OOP3.practice22;

/**
 * ClassName: AliPayment
 * Package: com.atguigu.chapter03_OOP.practice21
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/30
 */
public class AliPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("支付宝支付"+amount+"元");
        return true;
    }
}
