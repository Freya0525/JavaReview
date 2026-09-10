package com.bryea.chapter01;/**
 * ClassName: SwitchCaseTest1
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
案例3：使用switch-case实现：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。

*/
public class SwitchCaseTest1 {
    public static void main(String[] args) {
        System.out.println("请输入成绩：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        //方式2：体会case穿透
        switch(score / 10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
            default:
                System.out.println("成绩输入有误");
                break;
        }
    }
}
