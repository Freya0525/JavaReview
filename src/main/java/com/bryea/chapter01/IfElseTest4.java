package com.bryea.chapter01;/**
 * ClassName: IfElseTest4
 * Package: com.atguigu.chap01
 * Description:
 *
 * @Author Freya
 * @since 2026/5/9
 */

/**
 * @author Freya
 * @since 2026/5/9
 */
/*
练习3：
定义两个整数，分别为small 和 big，如果第一个整数small大于第二个整数big，就交换。输出显示small和big变量的值。
 */
public class IfElseTest4 {
    public static void main(String[] args) {
        int small=19;
        int big =15;
        if(small > big){
            int temp;
            temp = small;
            small = big;
            big = temp;
            System.out.println("small = " + small );
            System.out.println("big = "+ big);
        }else{
            System.out.println("small = " + small);
            System.out.println("big= " + big);
        }

    }
}
