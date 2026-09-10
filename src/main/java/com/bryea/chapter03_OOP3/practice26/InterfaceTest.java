package com.bryea.chapter03_OOP3.practice26;

/**
 * ClassName: IterfaceTest
 * Package: com.atguigu.chapter03_OOP.practice25
 * Description:
 *
 * @Author Freya
 * @Create 2026/8/1
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);
        System.out.println(Flyable.MAX_SPEED);

        Bullet bullet = new Bullet();
        bullet.fly();
        bullet.attack();

        //接口的多态性
        Flyable bullet1 = new Bullet();
        //因为接口没有构造器，所以不能造对象，所以不能new ,所以右边是new实现类。
        bullet1.fly();
    }

}
interface Flyable{//接口
    //全局常量
    public static final int MIN_SPEED = 0;
    int MAX_SPEED = 7900;//等价于public static final int MAX_SPEED = 7900;
    //接口属性必须使用public static final修饰，也可以省略。
    //MAX_SPEED = 790;//因为final所以不能重新赋值

    //方法可以省略public abstract 声明
    void fly();

}
interface Attackable { //接口
    void attack();
}

//此处如果是普通类Plane,那就得重写Flyable的方法
//不想重写就把类写成抽象类，所以abstract是这么来的
abstract class Plane implements Flyable{

}
//Flyable的实现类
class Bullet implements Flyable,Attackable{
    @Override
    public void fly() {
        System.out.println("让子弹飞一会儿");
    }

    @Override
    public void attack() {
        System.out.println("子弹可以击穿身体");
    }
}
//测试接口的多继承关系
interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{
    //接口可以多继承
}
class DD implements CC{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

}


