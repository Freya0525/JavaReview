package com.bryea.chapter03_OOP1.practice4;

/**
 * ClassName: MethodTest
 * Package: com.atguigu.chapter03_OOP.oop.practice4
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/12
 */
public class MethodTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.study();
        System.out.println(p1.getAge());
        System.out.println("总年龄："+p1.addAge(2));
        p1.sleep(8);//这里的8是实参

        Person p2 = new Person();
        p2.study();
        System.out.println(p2.getAge());
        p2.sleep(9);
        int i = p2.addAge(3);
        System.out.println("i = " + i);
    }
}
/*
 案例：
 （1）创建Person类的对象，设置该对象的name、age和gender属性，
 调用study方法，输出字符串“studying”；
 调用showAge()方法，返回age值；
 调用addAge(int addAge)方法给对象的age属性值增加addAge岁。比如：2岁。
 （2）创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 */
class Person{
    //属性
    String name;
    int age = 22;
    char gender;
    //方法
    public void eat(){
        System.out.println("人吃饭");
    }

    //这里的hour是形参
    public void sleep(int hour){
        System.out.println("人至少要睡"+hour+"小时");

    }
    public String  sleep(String hobby){
        String info = "我的爱好是"+hobby;
        System.out.println("我的爱好是"+ hobby);
        return info;
    }

    public int getAge(){
        int age = 23;
        return age;
    }

    public void study(){
        System.out.println("studying");
    }
    public int addAge(int addAge){
        int TotalAge = age+addAge;
        return TotalAge;
    }
}
