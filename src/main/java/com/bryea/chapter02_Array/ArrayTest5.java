package com.bryea.chapter02_Array;/**
 * ClassName: ArrayTest5
 * Package: com.atguigu.chap01
 * Description:
 *
 * @Author Freya
 * @since 2026/5/17
 */

/**
 * @author Freya
 * @since 2026/5/17
 */

public class ArrayTest5 {
    public static void main(String[] args) {
        //一维数组的两种声明方式：
        //第一种：先声明再赋值
        int[] nums;
        nums = new int[]{12,33,11,17,43,45,3};

        //第二种：声明同时赋值
        int[] nums1 = {12,33,54,64,75,76,98,54};

        /*
        注意：
        - 数组元素里存的不是元素本身，而是真正数据地址的引用，而真正的数据在堆内存里。
        - 数组元素里，基本类型数组直接存值，比如int类型，引用类型数组存的是对象的地址，比如String类型
        - 比如 int[] arr = {1,2,3}; arr存的整个数组对象的位置，因为数组本身就是一个对象，而某个元素的位
          置存的就是数据本身，如果是引用类型那某个元素的位置存的就是对象的引用。


        关于内存
        Java程序运行时JVM（Java虚拟机）会向操作系统申请一块内存。
        这块内存里会分很多区域，其中有一个区域叫“堆内存”。
        堆内存（Heap）是存对象，也就是new出来的东西，也会就是对象的实例。
        而arr在栈内存里，而真正的数组对象存在堆内存里。

        所以Java内存指的就是JVM管理的一整块运行内存。里面包含：
        · 堆
        · 栈
        · 方法区
        · 程序计数器
        · 本地方法栈
         */



        //-------------------------------------------
        //要存储一个小组的成绩
        int[] score; //int类型数组
        int grades; //普通int变量
        //grades={11,22,33,44}; //普通变量不能这样赋值
        //score={22,33,44,11,76,43,98}; //Java不支持这样分开声明+赋值。

        //要存储一组字母
        char[] letters;
        letters = new char[]{'a','b','c','f'};
        System.out.println("letters = " + letters); //输出的不是地址，数组对象的“地址信息”

        //比如，要存储一组姓名
        String names[];
        //names={"Freya","Oven"};
        names =new String[]{"Freya","Oven"};
        System.out.println(names);

        //比如要存储一组价格
        double price[] = {22.1,22,333,222,323,44.2};
        System.out.println("price="+price);



    }
}
