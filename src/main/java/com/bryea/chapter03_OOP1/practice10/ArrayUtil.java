package com.bryea.chapter03_OOP1.practice10;

/**
 * ClassName: ArrayUtil
 * Package: com.atguigu.chapter03_OOP.practice9
 * Description:自定义的操作数组的工具类
 *
 * @Author Freya
 * @Create 2026/7/16
 */
public class ArrayUtil {




/**
 * @Description TODO
 * @author Freya
 * @return
 */
    public int max(int[] arr){
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maxValue<arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }


/**
 * @Description 求int数组的总和
 * @author Freya
 * @return
 */
    public int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }


/**
 * @Description 求int型数组的最小值
 * @author Freya
 * @return
 */
    public int min(int[] arr){
        int minValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if(minValue>arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }


/**
 * @Description 求int型数组的元素的平均值
 * @author Freya
 * @return
 */
    public int avg(int[] arr){
        int sumValue = sum(arr); //调方法求总和
        return sumValue/arr.length;
    }


/**
 * @Description 遍历数组
 * @author Freya
 */
    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + i);
        }
        System.out.println();
    }

     /**
     * @Description 复制数组
     * @author Freya
     * @return
     */
    public int[] copy(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
        }
        return arr1;
    }

    public void sort(int[] arr,String desc){
        for (int i = 0; i < arr.length; i++) {
            //--------------------------------------
            //没写完
        }
    }


}















