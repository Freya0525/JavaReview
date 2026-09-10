package com.bryea.javaSe.singleton;
/**
 * ClassName: SingleFour
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

/*
懒汉式单例设计模式
懒汉：必须等到不得不做的时候，才会new对象。等别人来取对象时，才会new唯一的对象，别人不获取就不new

 */
public class SingleFour {
    private static SingleFour instance; //此时还未new对象
    private SingleFour(){
        System.out.println("我是SingleFour的无参构造" );
    } //构造器私有化

    public static void method(){//此时是一个普通的静态方法
        System.out.println("我就是一个普通话的静态方法");
    }


    public static synchronized SingleFour getInstance(){ //加上锁才能保证我们加上锁的对象是同一个
      if(instance == null ){
          instance = new SingleFour();
      }
        return  instance;
    }
}
