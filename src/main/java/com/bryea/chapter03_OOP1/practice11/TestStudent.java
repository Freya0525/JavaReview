package com.bryea.chapter03_OOP1.practice11;

/**
 * ClassName: TestStudent
 * Package: com.atguigu.chapter03_OOP.practice10
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/18
 */
public class TestStudent {
    public static void main(String[] args) {
        //调用无参构造创建对象
        Student student = new Student();

        //调用有参构造创建对象
        Student student1 = new Student("Freya", 12);


        System.out.println(student.getInfo());
        System.out.println(student1.getInfo());
    }
}
