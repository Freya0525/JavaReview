package com.bryea.javaSe.singleton;

/**
 * ClassName: SingleOne
 * Package: com.atguigu.javaSe.singleton
 * Description:
 *
 * @Author Freya
 * @since 2025/4/20
 */
/*
单例是：指唯一的实例，即一个类在整个Java程序中，只有唯一的对象，JVM中找不到他的第二个对象
编写单例类的模板或方式被称为单例设计模式。
如何编写一个单例类？
1.饿汉式单例设计模式
2.懒汉式单例设计模式
 */

//INSTANCE这个是单例对象的名称，可以自己取名字
/*
枚举类不能被实例化，他的构造器是私有的，他没有父类，也不能继承，一般枚举的成员不会很复杂
Java枚举的本质上是一种受限制的单例集合。它在类加载的时候就会把所有的枚举项创建出来，并保证你只能使用这些项，防止滥用或创建非法值
*/
//enum写法
public enum SingleOne {
    INSTANCE
    //枚举类，外面不能new对象，那我只能里面给他new一个

}
