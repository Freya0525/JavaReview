package com.bryea.chapter03_OOP1.practice2;

public class PersonTest {
    public static void main(String[] args) {
      //创建对象、类的实例化
        Person p1 = new Person();

        //通过对象调用属性或方法
        p1.name="Freya";
        p1.age=23;
        p1.gender = '女';

        System.out.println("p1的name = "+ p1.name+", " +
                "age="+p1.age+", gender"+p1.gender);

        //调用方法
        p1.eat();
        p1.sleep(6);
        p1.interest("跑步");


        //再创建一个Person类的实例
        Person p2 = new Person();
        p2.name="lusi";
        p2.age=19;
        p2.gender='女';

        p2.eat();
        p2.sleep(8);
        p2.interest("睡觉");
        System.out.println();

        System.out.println("p2的name = "+ p1.name+", " +
                "age="+p1.age+", gender"+p1.gender);

    }
}
