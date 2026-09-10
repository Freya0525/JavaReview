package com.bryea.chapter03_OOP3.practice20;

/**
 * ClassName: TestPayment
 * Package: com.atguigu.chapter03_OOP.practice19
 * Description: 测试Payment接口
 *
 * @Author Freya
 * @Create 2026/7/24
 */
public class TestPayment {
    public static void main(String[] args) {
        TestPayment t = new TestPayment();
        t.doPay(new Alipay());
        t.doPay(new WeChatPay());
    }
    public void doPay(Payment payment){
        payment.pay();
    }

}
