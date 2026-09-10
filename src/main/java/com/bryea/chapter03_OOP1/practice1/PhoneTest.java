package com.bryea.chapter03_OOP1.practice1;

public class PhoneTest { //是phone类的测试类
    public static void main(String[] args) {
        //复习 ：数据类型 变量名 = 变量值
        //创建Phone的对象  ==>类的实例化
        Phone phone = new Phone();

        //通过Phone的对象,调用其内部声明的属性或方法
        //格式：“对象.属性” “对象.方法”
        phone.name = "huawei";
        phone.price=1876.90;

        System.out.println("name="+phone.name+", price=" + phone.price);

        //Phone.name="naaa"; //类不能直接访问普通属性，必须先创建对象（实例），再通过对象访问属性。
        //"人"这个概念本身没有姓名。先创建实体类，讲这个实体类命名为p1，再对这个具体的对象的name属性赋值就是

        //调用方法
        phone.call();
        phone.sendMessage("有内鬼，终止交易");
        phone.playGame();

        System.out.println("name = "+ phone.name+", price= " +phone.price);
    }
}
