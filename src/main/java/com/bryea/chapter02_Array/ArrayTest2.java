package com.bryea.chapter02_Array;/**
 * ClassName: ArrayTest2
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
/*
数组的声明和初始化
数组的声明 数据类型[] 一维数组名称;   比如：int[] arr;

数组的初始化：
1.静态初始化:
方式①：数据类型[] 数组名  = new 数据类型[]{元素1，元素2，元素3，...};
方式②：
数据类型[] 数组名;
数组名 = new 数据类型[]{元素1，元素2，元素3，...};
2.动态初始化:
方式①：数据类型[] 数组名字 = new 数据类型[长度];
方式②：
数据类型[] 数组名字;
数组名字 = new 数组存储的数据类型[长度];
*/
public class ArrayTest2 {
    public static void main(String[] args) {
        //定义一个数组，输出第一个索引和第三个索引的数据，输出数组长度
        int[] age = {23,21,14,13,15,18,25};
        System.out.println(age[0]);
        System.out.println(age[2]);
        System.out.println("数组长度="+age.length);


        //静态初始化1:
        //数据类型[] 数组名 = new 数据类型[]{元素1，元素2，元素3，...};
        int[] arr = new int[]{12,22,33,44,55,14};

        //静态初始化2:
        int[] arr1;
        arr = new int[]{12,23,34,45};

        //动态初始化1:
        int[] arr2 = new int[3];

        //动态初始化2:
        int[] arr3;
        arr3 = new int[3];








    }
}
