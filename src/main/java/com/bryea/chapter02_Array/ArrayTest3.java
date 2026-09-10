package com.bryea.chapter02_Array;/**
 * ClassName: ArrayTest3
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
//数组遍历
//for循环遍历数组
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        //数组最大长度是arr.length,如果是arr.length=5，那么数组最后一个下标是array.length-1=4
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
