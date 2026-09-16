package com.bryea.chapter04_Error;

/**
 * ClassName: Demo11Exception
 * Package: com.bryea.chapter04_Error
 * Description:打印异常信息的三个方法
 *
 * @Author Freya
 * @Create 2026/9/16
 */
public class Demo11Exception {
    public static void main(String[] args) {
        //二、数组下标越界ArrayIndexOutOfBoundsException
        try{
            int[] arr = new int[5] ;
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e ){
//            System.out.println("数组下标越界异常");
//            e.printStackTrace();
//            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
