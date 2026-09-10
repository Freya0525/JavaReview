package com.bryea.javaSe.singleton;/**
 * ClassName: SingleThree
 * Package: com.atguigu.javaSe.singleton
 * Description:
 *
 * @Author Freya
 * @since 2025/4/20
 */

/**
 * @author Freya
 * @since 2025/4/20
 */

//模仿Runtime类
public class SingleThree {
    //创建好唯一的实例对象
    public static final SingleThree INSTANCE = new SingleThree();
    //  公开的   静态的   常量

    private SingleThree(){
        System.out.println("我是SingleThree的无参构造" );
    }

    public static SingleThree getInstance(){
        return INSTANCE; //在公开的静态方法里返回枚举实例
    }

    public static void method(){ //此时是一个普通的静态方法
        System.out.println("我就是一个普通的静态方法");
    }
}
