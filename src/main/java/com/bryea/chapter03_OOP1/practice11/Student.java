package com.bryea.chapter03_OOP1.practice11;

/**
 * ClassName: Student
 * Package: com.atguigu.chapter03_OOP.practice10
 * Description:类的成员之三：构造器
 *
 * @Author Freya
 * @Create 2026/7/18
 */
public class Student {
    private String name;
    private int age;


    //无参构造
    public Student(){}

    //有参构造
    public Student(String n ,int a ){
        name=n;
        age = a;
    }

    //getter方法
   public String getName(){
        return name;
   }

    //setter方法
   public void setName(String n ){
        name = n;
   }

    //getter方法
   public int getAge(){
        return age;
   }

    //setter方法
   public void setAge(int a ){
        age = a;
   }

   public String getInfo(){
        return "姓名"+name+"年龄"+age;
   }


 }
