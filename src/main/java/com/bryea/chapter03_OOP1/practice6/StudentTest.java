package com.bryea.chapter03_OOP1.practice6;

/**
 * ClassName: StudentTest
 * Package: com.atguigu.chapter03_OOP.oop.practice6
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/14
 */
public class StudentTest {
    public static void main(String[] args) {
        /**
         * 案例
         * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。 创建20个学生对象，
         * 学号为1到20，年级和成绩都由随机数确定。
         * 问题一：打印出3年级(state值为3）的学生信息。
         * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
         */
        //方式1:
        Student s1 = new Student();
        s1.number=1;
        s1.state=(int)(Math.random()* 6 + 1);
        s1.score=(int)(Math.random()* 101);

        Student s2 = new Student();
        s2.number=2;
        s2.state=(int)(Math.random()* 6 + 1);
        s2.score=(int)(Math.random()* 101);

        s1.info();

        //方式2:
        //对象数组：
        //String [] s4=new String[5];
        Student[] students= new Student[20];//长度为20的数组
        //通过循环结构给数组的属性赋值
        for (int i = 0; i < students.length; i++) {
            //数组元素的赋值
            students[i] = new Student();
            //数组元素是一个对象，给对象的各个属性赋值
            students[i].number=(i+1);
            students[i].state=(int)(Math.random()*6+1);
            students[i].score=(int)(Math.random()*101);
        }

        for (int i = 0; i < students.length; i++) {
            if(students[i].state==3){
            students[i].info();
            }
        }
    }
}
