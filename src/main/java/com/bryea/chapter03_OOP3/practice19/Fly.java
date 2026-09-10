package com.bryea.chapter03_OOP3.practice19;

/**
 * 接口
 * 接口普通方法默认是抽象方法。
 */
public interface Fly {
    //抽象方法
    public void fly();
    // 这里的void fly();等价于public abstract void fly();

/**
 * @Description 默认方法
 * @author Freya
 * 默认方法 --->在JDK8.0 时，接口中允许声明默认方法：
 * 公共的默认的方法：其中public 可以省略，建议保留，但是default不能省略
 * 默认方法可以有方法体。
 * 实现类可以不重写默认方法，如果不满意默认方法也可以重写。
 * jdk8.0为什么要增加default的原因：
 * 我给接口增加一个新功能，但是老的实现类不用修改，也能正常运行。
 */
    default void sleep(){ //默认方法
        System.out.println("飞累了，需要休息");
    }
    //实现类可以不重写默认方法

}
