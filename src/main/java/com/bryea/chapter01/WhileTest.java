package com.bryea.chapter01;/**
 * ClassName: WhileTest
 * Package: com.atguigu.chap01
 * Description:
 *
 * @Author Freya
 * @since 2026/5/14
 */

/**
 * @author Freya
 * @since 2026/5/14
 */
/*
while循环
语法格式：
①初始化部分
while(②循环条件部分){
③循环体
④迭代条件
}

说明：
while(循环条件)中循环条件必须是boolean类型
注意不要忘记声明④迭代部分。否则循环将不能结束

*/
public class WhileTest {
    public static void main(String[] args) {
        /*
         案例：遍历1-100的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
        */
        int num = 1;
        int count = 0;
        int sum = 0;
        while(num <= 100){
            if(num % 2 == 0){
                System.out.println(num);
                count++;
                sum+=num;
            }
            //迭代条件
            num ++ ;
        }
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);
    }
}
