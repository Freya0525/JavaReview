package com.bryea.javaSe.singleton;/**
 * ClassName: SingleTwo
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

//古老的枚举方式(JD5之前)
public class SingleTwo {
    //创建好唯一的实例对象
    public static final SingleTwo INSTANCE = new SingleTwo();
//  公开的   静态的   常量
    private SingleTwo(){ //构造器私有化
    };


}
