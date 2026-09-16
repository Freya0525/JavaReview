package com.bryea.chapter04_Error;

import java.io.FileOutputStream;

/**
 * ClassName: Demo01Exception
 * Package: com.bryea.chapter04_Error
 * Description:异常处理：1.编译时期异常 2.运行时期异常
 * 1.概述：代码出现了不正常的现象，在java中变现出来的是一个一个的类，一个一个的对象
 * @Author Freya
 * @Create 2026/9/15
 */
/*

 */
public class Demo01Exception {
    public static void main(String[] args) {
        //method(); //StackOverflowError

        //编译时期异常
        //FileOutputStream fileOutputStream = new FileOutputStream("JavaSE/practice21.txt");
        //语法没问题，但是这个文件不存在，编译不通过，所以报红。
        //抛出FileNotFoundException，FileNotFoundException继承自IOException，IOException继承自Exception，所以追根溯源就是这个异常属于Exception，编译时期异常。

        //运行时期异常
        int[] arr=new int[10];
       // System.out.println(arr[100]); //ArrayIndexOutOfBoundsException
        //ArrayIndexOutOfBoundsException继承自IndexOutOfBoundsException，IndexOutOfBoundsException继承自RuntimeException，所以追根溯源就是这个异常属于RuntimeException，运行时异常。


    }

    public static void method(){
        method();


    }
}
