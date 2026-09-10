package com.bryea.chapter03_OOP1.practice8;

/**
 * ClassName: Test
 * Package: com.atguigu.chapter03_OOP.oop.practice8
 * Description:
 *
 * @Author Freya
 * @Create 2026/7/14
 */

/**
 * 参数的传递机制
 * 附加题：（每题10分）
 */
public class Test {
    public static void main(String[] args) {
         int a=10;
          int b=10;
        Test test = new Test();
        //test.method(a,b);
          method(a,b);//需要在method方法被调用之后，仅打印出a=100,b=200，请写
                     //出method方法的代码

          System.out.println("a="+a);
          System.out.println("b="+b);
    }

      //代码编写处
    public static void method(int a, int b){
        System.out.println("a="+ a*a+"， b="+b*b);
    }
}
