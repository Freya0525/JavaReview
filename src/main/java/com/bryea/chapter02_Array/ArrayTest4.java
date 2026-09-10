package com.bryea.chapter02_Array;/**
 * ClassName: ArrayTest4
 * Package: com.atguigu
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
数组练习：
①定义数组
int[] nums={12,45,67,23,89};
②遍历数组,输出所有元素。
③求数组总和
④求平均值
⑤求最大值
*/
public class ArrayTest4 {
    public static void main(String[] args) {
    int[] nums={12,45,67,23,89};
    int sum=0;
    int max = nums[0];
        for (int i = 0; i <= nums.length - 1; i++) {
            int num1=nums[i];
            System.out.println("i="+num1);
            sum+=num1;
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("总和:"+sum);
    int average = sum/nums.length;
        System.out.println("平均值："+average);
        System.out.println("max = " + max);


    }
}
