package com.bryea.javaSe.singleton;/**
 * ClassName: TestSingleton
 * Package: com.atguigu.javaSe.singleton
 * Description:
 *
 * @Author Freya
 * @since 2025/4/20
 */

import org.junit.Test;


/**
 * @author Freya
 * @since 2025/4/20
 */

public class TestSingleton {

      @Test
        public void test1(){
          SingleOne s1 = SingleOne.INSTANCE;
          SingleOne s2 = SingleOne.INSTANCE;
          System.out.println(s1==s2); //true
          //说明内存当中只有一个实例对象
      }

        @Test
          public void test2(){
            SingleTwo s1 = SingleTwo.INSTANCE;
            SingleTwo s2 = SingleTwo.INSTANCE;
            System.out.println(s1==s1);//true
        }

          @Test
            public void test3(){
            SingleThree s1 = SingleThree.getInstance();
            SingleThree s2 = SingleThree.getInstance();
            System.out.println(s1==s2);//true
            //不管new几次，拿到的实例对象是同一个
          }
          @Test
            public void test4(){
            SingleThree.method();
            //我是SingleThree的无参构造
            //我就是一个普通的静态方法
            //此时只是调用method静态方法，不涉及到new对象，他直接实例化对象了，因为这个是饿汉式，无需等到获取再new对象
            }

          @Test
              public void test5(){
                 SingleFour.method();//我就是一个普通话的静态方法
              //没有输出无参构造，说明没有调用无参构造，因为此时不涉及到new对象，只是调用静态方法
              }

            @Test
              public void test6(){
              SingleFour s1 = SingleFour.getInstance();
              SingleFour s2 = SingleFour.getInstance();
              System.out.println(s1==s2);
              //我是SingleFour的无参构造
              //true
            }
}
