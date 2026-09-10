package com.bryea.chapter01;/**
 * ClassName: IfElseTest
 * Package: com.atguigu.chap01
 * Description:
 *
 * @Author Freya
 * @since 2026/5/8
 */

/**
 * @author Freya
 * @since 2026/5/8
 */
/*
流程控制语句：
1.顺序结构：先声明再引用
2.分支结构：if-elset条件判断分支结构、if...else嵌套，switch-case选择结构
3.循环结构: for、while、do-while
 */
public class IfElseTest {
    public static void main(String[] args) {
/*
案例1：成年人心率的正常范围是每分钟60-100次。体检时，如果心率不在此范围内，则提示需要做进一步的检查。
 */
        int heartBeats = 89;
        if(heartBeats <60 || heartBeats > 100){
            System.out.println("您需要进一步的做检查" );
        }
        System.out.println("体检结果");

        /*
案例2：定义一个整数，判定是偶数还是奇数。
 */
        int num =16 ;
        if(num%2 ==0 ){
            System.out.println("num是偶数" );
        }else{
            System.out.println("num是偶数");
        }
    }
}
