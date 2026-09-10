package com.bryea.chapter03_OOP3.practice17;

/**
 * ClassName: Something2
 * Package: com.atguigu.chapter03_OOP.practice16
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/24
 */
public class Something2 {
    public static void main(String[] args) {
        Other other = new Other();
        Something2 S2 = new Something2();
        S2.addOne(other);
        System.out.println("other.i = " +other.i );
    }
    public void addOne(final Other o ){ //final修饰对象变量
        o.i++;
    }
}
class Other{
    public int i;
}