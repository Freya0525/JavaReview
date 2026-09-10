package com.bryea.chapter01;/**
 * ClassName: IfElseTest2
 * Package: com.atguigu.chap01
 * Description:
 *
 * @Author Freya
 * @since 2026/5/8
 */

import java.util.Scanner;

/**
 * @author Freya
 * @since 2026/5/8
 */
/*
测试if-else的嵌套使用

案例：
由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else)，并且从小到大输出。

拓展：你能实现从大到小顺序的排列吗？

1. 从开发经验上讲，没有写过超过三层的嵌套if-else结构。
2. 如果if-else中的执行语句块中只有一行执行语句，则此执行语句所在的一对{}可以省略。但是，不建议省略
*/
public class IfElseTest2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int num3 = sc.nextInt();


        int first;
        int second;
        int third;
        if(num1<=num2 && num1<=num3){
            first = num1;
            if(num2>=num3){
                second = num3;
                third = num2;

            }else {
                second = num2;
                third = num3;
            }
        } else if (num2<=num1 && num2<=num3) {
            first = num2;
            if(num1>num3){
                second = num3;
                third = num1;
            }else {
                second = num1;
                third = num3;
            }
        } else {
            first=  num3;
            if(num1>num2){
                second = num2;
                third = num1;
            }else {
                second = num1;
                third = num2;
            }
        }

        System.out.println("从小到大排序结果: " + first + " < " + second + " < " + third);
    }
}






























