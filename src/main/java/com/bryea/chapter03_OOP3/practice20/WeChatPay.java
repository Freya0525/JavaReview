package com.bryea.chapter03_OOP3.practice20;

/**
 * ClassName: WeChatPay
 * Package: com.atguigu.chapter03_OOP.practice19
 * Description: Payment接口的实现类
 *
 * @Author Freya
 * @Create 2026/7/24
 */
public class WeChatPay implements Payment{
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
