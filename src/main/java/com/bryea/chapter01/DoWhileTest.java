package com.bryea.chapter01;/**
 * ClassName: DoWhileTest
 * Package: com.atguigu.chap01
 * Description:
 *
 * @Author Freya
 * @since 2026/5/14
 */

/**
 * @author Freya
 * @since 2026/5/14
 */

/*
循环结构之一：do-while
do-while的格式：
①初始化条件
do{
③循环体
④迭代部分
}while(②循环条件)
 */
public class DoWhileTest {
    public static void main(String[] args) {
    //输出50次Helloworld
        int i =0;
        do{
            System.out.println("HelloWorld"+i);
            i++;
        }while(i<50);
    }
}
