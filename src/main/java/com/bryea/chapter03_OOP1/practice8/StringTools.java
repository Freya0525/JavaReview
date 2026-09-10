package com.bryea.chapter03_OOP1.practice8;

/**
 * ClassName: StringTools
 * Package: com.atguigu.chapter03_OOP.oop.practice8
 * Description:可变参数的练习
 *
 * @Author Freya
 * @Create 2026/7/14
 */

/**
 * 案例1：n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回
 * 空字符串""
 */
public class StringTools {
String cancat(char seperator, String ...args){
    String str = "";
    for (int i = 0; i < args.length; i++) {
        if(i ==0 ){
            str += args[i];
        }else{
            str += seperator+args[i];
        }
    }
    return str;
}
}
