package com.bryea.chapter02_Array;/**
 * ClassName: ArrayTest
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
数组的概述
一维数组：
//推荐
元素的数据类型[] 一维数组的名称；

注意：切记一定要在数据类型后面跟[]才能表示这是数组，如果没加[]那就表示这是变量
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] array = {90,80,60};

        //练习1
        //定义一个数组，保存 5 个整数：10, 20, 30, 40, 50
        int[] array1 ={ 10,20,30,40,50};

        //定义一个数组，输出第一个索引和第三个索引的数据，输出数组长度
        int[] age = {23,13,23,44,44,14};
        System.out.println(age[0]);
        System.out.println(age[2]);

        //静态初始化1:
        //数据类型[] 数组名。= new 数据类型[]{元素1，元素2，元素3}
        int[] arr = new int[]{1,2,3,4};

        //静态初始化2:
        int[] arr1;
        arr1 = new int[]{1,2,3,4,5};



        //动态初始化1:
        int[] arr2 = new int[3];//3是数组长度

        //动态初始化2:
        int[] arr3;
        arr3 = new int[3];

        //比如，要存储一个小组的成绩
        int[] scores;
        int grades;
        //报错： System.out.println("scores = " + scores);初始化之前不能使用

        //比如，要存储一组字母
        char[] letters;

        //比如，要存储一组姓名
        String[] names;

        //比如，要存储一组价格
        double[] price;

        //比如，要存储排号
        int num[];//这种声明也可以
        num= new int[]{1,2,3,4};

        //比如，要存储学号
        int[] num1;

        int[] arr5={1,2,3,4,5};

        int[] arr4 ;
        arr4 =new int[]{}; //空数组

        int[] arr6;
        arr6 = new int[5]; //长度为5的数组，元素全是0，不过可以再次赋值
        System.out.println(arr6[0]);
        System.out.println("arr6[1] = " + arr6[1]);

        arr6[0]= 1;
        arr6[1]=2;
        arr6[2]=3;
        for (int i = 0; i < arr6.length; i++) {
            System.out.println("arr6[i]"+arr6[i]);
        }
    }
}
