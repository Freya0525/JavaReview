package com.bryea.chapter04_Error;

/**
 * ClassName: Demo02Exception
 * Package: com.bryea.chapter04_Error
 * Description:异常出现的过程
 *
 * @Author Freya
 * @Create 2026/9/16
 */
public class Demo02Exception {
    public static void main(String[] args) { //第三步
                                            /*
                                            1.JVM将异常信息打印到控制台上
                                            2.终止程序
                                             */
        int[] arr = {1,2,3,4,5};
        method(arr);//第二步：
                     /*
                     1.此处接收到了抛过来的异常
                     2.发现此处还是没有处理
                     3.所以继续往上抛
                      */
    }
    public static void method(int[] arr){
        System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
        /*
        第一步：
        1.此处出现了异常 -> ArrayIndexOutOfBoundsException
        2.JVM捕捉到这个异常
        3.此时jvm就会看这里有没有处理异常，发现没有处理
        4.JVM创建这个异常对象，自动往上抛 -> 哪里调用抛给哪里
         */
    }
}
