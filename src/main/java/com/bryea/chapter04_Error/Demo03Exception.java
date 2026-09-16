package com.bryea.chapter04_Error;

/**
 * ClassName: Demo03Exception
 * Package: com.bryea.chapter04_Error
 * Description:创建异常对象
 * 学这个是为了后面学习如何处理异常
 * 1.格式：
 *     throws new 异常对象()
 * @Author Freya
 * @Create 2026/9/16
 */
public class Demo03Exception {
    public static void main(String[] args) {
//        String s = "abc.txt";
        String s = "abc.1txt";//NullPointerException
        insert(s);
        System.out.println("hahaha");
    }



/**
 * @Description 创建异常类对象
 * 用到了一个String类中的方法：
 * 判断字符串是否以指定的串儿结尾
 * 比如“hello.txt".endsWith(".txt") ->true
 * @author Freya
 */
    public static void insert(String s ){
        if(!s.endsWith(".txt")){
           throw new NullPointerException();
        }
        System.out.println("hehehehe");
    }}
