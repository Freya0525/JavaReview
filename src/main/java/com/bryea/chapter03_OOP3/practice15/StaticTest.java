package com.bryea.chapter03_OOP3.practice15;

/**
 * ClassName: StaticTest
 * Package: com.atguigu.chapter03_OOP.practice14
 * Description:关键字：static,静态b变量测试
 *
 * @Author Freya
 * @Create 2026/7/20
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese c1= new Chinese("康师傅", 12);
        c1.nation="中国";

        Chinese c2 = new Chinese("NASA", 12);
        c2.nation="漂亮国";

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(Chinese.nation);
    }
}
