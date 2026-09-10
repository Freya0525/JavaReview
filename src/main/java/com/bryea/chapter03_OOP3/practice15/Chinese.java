package com.bryea.chapter03_OOP3.practice15;

/**
 * ClassName: Chinese
 * Package: com.atguigu.chapter03_OOP.practice14
 * Description:关键字：static，静态变量
 *
 * @Author Freya
 * @Create 2026/7/20
 */
public class Chinese {
    //实例变量
    String name;
    int age;
    //类变量
    static String nation;

    //无参构造
    public Chinese(){};
    //有参构造
    public  Chinese(String  name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
