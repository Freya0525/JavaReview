package com.bryea.chapter03_OOP3.practice23;

/**
 * ClassName: WechatPay
 * Package: com.atguigu.chapter03_OOP.practice22
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/30
 */
public class WechatPay implements Payment{
    @Override
    public void pay(double mount) {
        System.out.println("微信支付"+mount+"元");
    }
}
