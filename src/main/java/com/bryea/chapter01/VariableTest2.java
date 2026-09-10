package com.bryea.chapter01;/**
 * ClassName: VariableTest2
 * Package: com.atguigu.chap01
 * Description:
 *
 * @Author Freya
 * @since 2026/5/8
 */

/**
 * @author Freya
 * @since 2026/5/8
 */
/*
测试字符类型和布尔类型
 */
public class VariableTest2 {
    public static void main(String[] args) {
        //1.字符类型:char（2byte）
        char c1 = 'a';
        System.out.println("c1 = " + c1);
        char c2 = '中';
        System.out.println("c2 = " + c2);
        char c3 = '1';
        System.out.println("c3 = " + c3);
        char c4 = '%' ;
        System.out.println("c4 = " + c4);
        char c5 = 'Y';
        System.out.println("c5 = " + c5);
      //  char c6 = ''; //编译不通过，java不允许空字符字面量
       // char c7 = ab;//java会把ab当成一个标识符（identifier），编译器怎么理解？char c7 = 某个叫 ab 的变量;
        //char c8 ='ab'; //只能存 一个,所以编译不通过
        //Java 中 char的本质
        //char是 16 位无符号整数
        //用来表示 一个 UTF-16 编码单元
        //必须有 且只能有一个字符

        //表示形式：直接使用Unicode值来表示字符型常量。
        char c9 = '\u0036';// 斜杠u是 Unicode 转义序列,斜杠u + 4位16进制,0036的十六进制含义,0x0036 = 十进制 54,查 ASCII / Unicode：54 → '6'

        System.out.println("c9 = " + c9);


    }
}
