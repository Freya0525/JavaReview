package com.bryea.chapter03_OOP1.practice6;

/**
 * ClassName: Student
 * Package: com.atguigu.chapter03_OOP.oop.practice6
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/14
 */
/**
 * 对象数组
 * 数组的元素可以是基本数据类型，也可以是引用数据类型。
 * 当元素是引用数据类型中的类时，我们称之为对象数组。
 * 注意：对象数组，首先要创建数组对象本身，即确定数组的长度，然后再创建每一个元素对象，如果不创建，
 * 数组的元素的默认值就是 null ，所以很容易出现 空指针异常NullPointerException 。
 */

/**
 * 案例
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。 创建20个学生对象，
 * 学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class Student {
    int number; //学号
    int state; //年纪
    int score; //成绩

    //显示学生信息
    public void info(){
        System.out.println("number = " + number+", state= "+state+", score="+score);
    }

}
