package com.bryea.chapter03_OOP1.practice10;

/**
 * ClassName: PerosonTest
 * Package: com.atguigu.chapter03_OOP.practice9
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/16
 */

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        //实例变量私有化，无法直接通过类访问或修改
       // person.name="freya";
       // person.age = 12;

        person.setName("张三");
        System.out.println("person.name = " + person.getName());

        person.setAge(16);
        System.out.println("person.age = " + person.getAge());
        person.setAge(-10);//对外暴露修改属性的功能最大的好处：可以检查数据
        System.out.println("person.age = " + person.getAge());

        person.setMarry(true);
        System.out.println("person.marry = " + person.isMarry());


    }
}
