package com.bryea.chapter03_OOP3.practice22;

/**
 * ClassName: WechatPay
 * Package: com.atguigu.chapter03_OOP.practice21
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/30
 */
public class WechatPay implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("微信支付"+amount+"元");
        return true;
    }
}
