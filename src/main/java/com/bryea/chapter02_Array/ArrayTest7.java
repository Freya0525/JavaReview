package com.bryea.chapter02_Array;/**
 * ClassName: ArrayTest7
 * Package: com.atguigu.chap01
 * Description:
 *
 * @Author Freya
 * @since 2026/5/18
 */

import java.util.Scanner;

/**
 * @author Freya
 * @since 2026/5/18
 */
/*
**案例3：**从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
- 成绩>=最高分-10  等级为’A’
- 成绩>=最高分-20  等级为’B’
- 成绩>=最高分-30  等级为’C’
- 其余            等级为’D’
提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 */
public class ArrayTest7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //第一步：录入学生人数
        System.out.println("请输入学生人数：");
        int count = scanner.nextInt();//学生人数
        //第二步：创建数组
        int[] score = new int[count];

        int maxScore = score[0];
        //第三步：遍历数组并逐个录入学生成绩
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入成绩：");
            score[i] = scanner.nextInt();
            if(maxScore< score[i]){
                 maxScore=score[i];
            }
        }
        System.out.println("最大值 = " + maxScore);

        char grade;
        //遍历一次，输出学生成绩和等级
        for (int i = 0; i < score.length; i++) {
            if(score[i] >= maxScore-10){
                grade = 'A';
            }else if (score[i] >= maxScore-20 ){
                grade = 'B';
            } else if (score[i] >= maxScore-30 ) {
                grade = 'C';
            }else{
                grade = 'D';
            }
            System.out.println("student " + i + " score is "+score[i] + "grade is" + grade);
        }

        scanner.close();
    }
}
