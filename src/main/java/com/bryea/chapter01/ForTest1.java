package com.bryea.chapter01;/**
 * ClassName: ForTest1
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

public class ForTest1 {
    public static void main(String[] args) {
/*
题目：输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
*/
        for(int i = 0 ;i<999;i++){
           int ge = i%10;
           int shi = i /10 %10;
           int bai = i/100;
           if(i == ge*ge*ge + shi*shi*shi + bai*bai*bai){
               System.out.println(i);
           }
        }
    }
}
