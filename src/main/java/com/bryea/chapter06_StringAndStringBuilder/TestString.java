package com.bryea.chapter06_StringAndStringBuilder;

import org.junit.Test;

/**
 * ClassName: TestString
 * Package: com.bryea.chapter06_StringAndStringBuilder
 * Description:
 *
 * @Author Freya
 * @Create 2026/9/18
 */
public class TestString {
    @Test
    public void test() {
        //1.字符串是对象
        String name = "Freya";
        //这里的"Freya"本身就是一个String对象，name保存的是该对象的引用。

        //2.字符串内容不可变。
        String str = "Hello";
         str = str + "world";
        System.out.println("str = " + str);
        //这段代码并没有修改原来的“Hello”,而是创建了新的字符串“hello world”,然后让str指向新对象。
        //因此：
        String name1 = "oliver";
        String concat = name1.concat("def");
        System.out.println("concat = " + concat);

        //3.相同的字符串可以共享
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1==s2); //true
        //因为字符串常量池中通常只保存一份“abc”,s1和s2指向同一个对象。
        //但不要使用 == 判断字符串内容，应该使用equals()

        System.out.println("------------------");
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3==s4); //false，比较的是地址值
        System.out.println(s3.equals(s4)); //比较的是字符串内容


    }

    @Test
    public void test2() {
        //4.String的常见创建方式
        //空字符串
        String s = new String();

        //根据已有字符创建
        String s1 = new String("abc");

        //byte 数组转换成字符串
        byte[] bytes = {1,2,3,4};
        String s2 = new String(bytes);

        //char数组转换成字符串
        char[] chars = {'a','b','c','d'};
        String s3 = new String(chars);

        //最常用的
        String s4 = "abc";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

    }
}
