package com.bryea.chapter02_Array;/**
 * ClassName: ArrayTest6
 * Package: com.atguigu.chap01
 * Description:
 *
 * @Author Freya
 * @since 2026/5/18
 */

import java.util.Scanner;

/**
 * @author Freya
 * @since 2026/5/18
 */
/*
案例1：输出英文星期几
用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 */
public class ArrayTest6 {
    public static void main(String[] args) {
        //声明并初始化星期数组
        String[] weeks = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = scanner.nextInt();
        if(num<1 || num>7){
            System.out.println("非法数字！");
        }else{
            System.out.println("星期对应的数字是："+weeks[num-1]);
        }
    }
}
