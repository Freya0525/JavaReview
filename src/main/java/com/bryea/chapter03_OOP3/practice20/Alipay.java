package com.bryea.chapter03_OOP3.practice20;

/**
 * ClassName: Alipay
 * Package: com.atguigu.chapter03_OOP.practice19
 * Description: Payment接口的实现类
 *
 * @Author Freya
 * @Create 2026/7/24
 */
public class Alipay implements Payment{
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
