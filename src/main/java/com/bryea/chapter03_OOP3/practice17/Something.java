package com.bryea.chapter03_OOP3.practice17;

/**
 * ClassName: Something
 * Package: com.atguigu.chapter03_OOP.practice16
 * Description:final局部变量
 *
 * @Author Freya
 * @Create 2026/7/24
 */
public class Something {
    public int addOne(final int x){
        //return ++x; //报错，这里是在重复赋值所以报错
                      //cannot assign a value to final variable 'x'
       // return x=10;//也报错，因为形参进入方法时已赋值，所以在这里x=10是重新赋值，return 10;更是重新赋值，所以会报错。

        return x;
    }
}
