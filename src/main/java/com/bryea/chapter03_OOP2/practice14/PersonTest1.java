package com.bryea.chapter03_OOP2.practice14;

/**
 * ClassName: PersonTest1
 * Package: com.atguigu.chapter03_OOP.practice13
 * Description:测试向上转型，向下转型
 *
 * @Author Freya
 * @Create 2026/8/5
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();
        //不能调用子类特有的结构
       //p1.earnMoney(); //因为p1是Person类，所以编译器只去Person类里面找方法
        //System.out.println(p1.isSmoking);

        //无法调用子类特有的方法 ，所以需要向下转型。
        //向下转型：使用强转符
        Man m1 = (Man)p1;
        m1.earnMoney();
        System.out.println(m1.isSmoking);

        System.out.println(p1==m1); //true，p1和m1指向堆空间中的同一个对象


        /*
        向下转型可能会出现
         */
        Person p2 = new Woman();
        //Man m2 = (Man)p2; //ClassCastException，编译时不报错，运行时报错
        //虽然编译通过，但是运行时会出现ClassCastException
        //m2.earnMoney();

        /*
          1.建议在向下转型前，使用instanceOf进行判断，避免出现类型转换异常
          2.格式：a instanceOf A : 判断对象是a是否是类A的实例
          3.如果a instanceOf A 返回true,则：
                a instanceOf superA 返回也是true。其中，A是superA的子类。
        */
        if(p2 instanceof Man){ //用instanceOf判断，如果判断p2不是Man的父类就无法向下转型
            Man m3=(Man)p2; //没有报错，说明没有instanceOf判断为fasle后没有执行这一步
            m3.earnMoney();
        }

        if(p2 instanceof Woman){
            System.out.println("woman");
        }
        if(p2 instanceof Person){
            System.out.println("Person");
        }
        if(p2 instanceof Object){
            System.out.println("Object");
        }

    }
}
