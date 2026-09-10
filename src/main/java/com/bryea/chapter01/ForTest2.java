package com.bryea.chapter01;/**
 * ClassName: ForTest2
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
案例：输入两个正整数m和n，求其最大公约数和最小公倍数。

比如：12和20的最大公约数是4，最小公倍数是60。

约数：12为例，约数有1,2,3,4,6,12
      20为例，约数有1,2,4,5,10,20

倍数：12为例，倍数有12,24,36,48,60,72,....
      20为例，倍数有20,40,60,80,....


说明：
1. 我们可以在循环结构中使用break。一旦执行break，就跳出（或结束）当前循环结构。
2. 如何结束一个循环结构？
	方式1：循环条件不满足。（即循环条件执行完以后是false）
	方式2：在循环体中执行了break

 */
public class ForTest2 {
    public static void main(String[] args) {
        int m= 12;
        int n= 20;
        int min = (m<n)?m:n;
        for(int i=min; i>0;i--){
            if(m%i==0 && n%i ==0){
                System.out.println("最大公约数为：" + i);
                int gong = m*n/i;
                System.out.println("最大公倍数为                                                                                                                                                                                                                                                                                                                                                                                    "+gong);
            }

        }
    }
}
