package com.bryea.chapter01;/**
 * ClassName: ForTest
 * Package: com.atguigu.chap01
 * Description:
 *
 * @Author Freya
 * @since 2026/5/12
 */

/**
 * @author Freya
 * @since 2026/5/12
 */

/*
循环结构之一：for
1.java中规范了3中循环结构：for 、while 、do-while
2.凡是循环结构就一定会有4个要素：
①：初始化条件
②：循环条件 ---->
③：循环体
④：迭代部分
for循环：
for(①：②：④){
 ③
 }

 执行过程：① - ② - ③ - ④ - ② - ③ - ④- 。。。。-②

 注意：初始化条件不一定是固定值，但必须是可计算、可赋值的表达式。
 比如：for (int i > 0; i < 10; i++) { }  // ❌ 错误，i>0 是条件，不是赋值
 */
public class ForTest {
    public static void main(String[] args) {
//需求1：题目：输出5行HelloWorld
        for(int i=1;i<5;i++){
            System.out.println("HelloWorld");
        }

        System.out.println();

        //需求3：遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
        int count = 0;//偶数个数
        int sum=0;//偶数和
        for(int i=1; i<=100;i++){
            if(i%2==0){
                count = count + 1;
                sum = sum + i;
            }
        }
        System.out.println("偶数个数=" + count);
        System.out.println("偶数总和 = " + sum);
    }
}
