package com.bryea.chapter04_Error;

/**
 * ClassName: Demo07Exception
 * Package: com.bryea.chapter04_Error
 * Description:异常处理方式二：try...catch 练习
 *             异常出现的过程
 *
 * @Author Freya
 * @Create 2026/9/16
 */
/*
执行过程：
JVM 从上往下执行 try 中的代码。
如果没有异常，catch 不执行。
如果发生异常，立即停止执行 try 中剩余代码。
JVM 寻找能够匹配该异常的 catch。
执行对应的 catch。
try-catch 结束后继续执行后面的代码。
 */
public class Demo07Exception {
    public static void main(String[] args) {
        //一、算数异常ArithmeticException
        try {
            System.out.println("第一行");
            int result = 10/0;
        }catch (ArithmeticException e ){
            System.out.println("发生算术异常");
        }
        System.out.println("程序继续执行");


        //二、数组下标越界ArrayIndexOutOfBoundsException
        try{
           int[] arr = new int[5] ;
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("数组下标越界异常");
        }

        //三、空指针异常NullPointerException
        try{
            String text =null;
            System.out.println(text.length());
        }catch (NullPointerException e ){
            System.out.println("空指针异常"); //字符串不能为null
        }

        //四、数字类型异常NumberFormatException
        try{
          int number = Integer.parseInt("abc");
        }catch (NumberFormatException e ){
            System.out.println("数字类型异常");
        }
    }

}
