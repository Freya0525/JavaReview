package com.bryea.chapter01;/**
 * ClassName: SwitchCaseTest
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
分支结构Switch-case的使用
1.语法表达式：
switch(表达式){
    case 常量1：
        //执行语句1
        break;
    case 常量2：
        //执行语句2
        break;
    case 常量3：
        //执行语句3
        break;
    default:
        //执行语句4
        break;
}

2.执行过程：
根据表达式中的值，依次匹配case语句，一旦某一个case中的常量相等，那么就执行此case中的执行语句。
执行完此执行语句之后，
        情况1：遇到break,则执行break后跳出当前的switch-case结构
        情况2：没有遇到break,则继续执行其后的case中的执行语句。---->case穿透
        。。。
        直到遇到break或执行完所有case及default的语句，退出当前的switch-case结构。

3.说明：
①switch中的表达式只能是特定的数据类型。如下：byte \ short \ char \ int \ 枚举(JJDK5.0新增) \ String(JDK7.0新增)
(2)case子句中的值必须是常量，不能是变量名或不确定的表达式值或范围
(3)default子句是可选的。同时，位置也是灵活的。当没有匹配的case时，执行default。
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
       //例1
        int num = 2;
        switch(num){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
            default:
                System.out.println("this is default");
        }



        //例2
        String season="summer";
        switch(season){
            case "spring":
                System.out.println("春暖花开");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "winter":
                System.out.println("冬雪皑皑");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
