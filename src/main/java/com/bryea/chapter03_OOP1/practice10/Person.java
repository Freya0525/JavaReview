package com.bryea.chapter03_OOP1.practice10;

/**
 * ClassName: Person
 * Package: com.atguigu.chapter03_OOP.practice9
 * Description:成员变量/属性私有化
 *
 * @Author Freya
 * @Create 2026/7/16
 */

/**
 * 封装的体现：
 * 成员变量/属性私有化
 * 概述：私有化类的成员，提供公共的get和set方法，对外暴露获取和修改属性的功能。
 * 实现步骤：
 * 使用private 修饰成员变量
 * private 数据类型 变量名;
 */
public class Person {
    //私有化属性
    private String name;
    private int age;
    private boolean marry;

    //提供get方法set方法，可以访问成员变量，代码如下：
    public void setName(String name1){
        name = name1;
    }
    public String  getName(){
        return name;
    }
    public void setAge(int age1){
        if(age1>=0 && age1<150){
            this.age=age1;
        }else{
            System.out.println("年龄不合法");
        }
    }
    public int  getAge(){
        return age;
    }
    public void setMarry(boolean marry1){
       marry = marry1;
    }
    public boolean isMarry(){
        return marry;
    }
}


