package com.bryea.chapter01;/**
 * ClassName: IfElseTest5
 * Package: com.atguigu.chap01
 * Description:
 *
 * @Author Freya
 * @since 2026/5/9
 */

import java.util.Scanner;

/**
 * @author Freya
 * @since 2026/5/9
 */
/*
**练习4：**小明参加期末Java考试，通过考试成绩，判断其Java等级，成绩范围[0,100]
- 90-100      优秀
- 80-89        好
- 70-79        良
- 60-69        及格
- 60以下    不及格
 */
public class IfElseTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入成绩：");
        int score = sc.nextInt();
        if(score >=90 && score <=100){
            System.out.println("优秀");
        } else if (score>=80 && score<=89) {
            System.out.println("好");
        } else if (score >=70 && score <=79) {
            System.out.println("良");
        } else if (score >=60 && score <=69) {
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
    }
}
