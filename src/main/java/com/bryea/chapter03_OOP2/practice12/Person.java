package com.bryea.chapter03_OOP2.practice12;

/**
 * ClassName: Person
 * Package: com.atguigu.chapter03_OOP.practice11
 * Description:关键字：this
 *
 * @Author Freya
 * @Create 2026/7/19
 */

/**
 * 什么时候用this
 * 当形参与成员变量同名时，如果在方法内或构造器内需要使用成员
 * 变量，必须添加this来表明该变量是成员变量，必须添加this来
 * 表明该变量是类的成员变量。即：我们可以用this来区分成员变量
 * 和局部变量
 */
public class Person {
    private String name;
    private  int age;

    public Person(String name,int age){
        this.name=name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public  void setName(String name){
        this.name=name;
    }
    public void setAge(int age ){
        this.age= age;
    }
    public int  getAge(){
        return this.age;
    }
    public void getInfo(){
        System.out.println("姓名： " + name );
        this.askAge();
    }
    public void askAge(){
        System.out.println("年龄："+this.age);
    }
}
