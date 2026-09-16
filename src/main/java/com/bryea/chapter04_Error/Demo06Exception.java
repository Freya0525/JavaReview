package com.bryea.chapter04_Error;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: Demo06Exception
 * Package: com.bryea.chapter04_Error
 * Description:异常处理方式二：try...catch
 * 格式：
 * try{
 *     可能出现异常的代码
 *  }catch(异常 对象名){
 *      异常处理方案 -> 直接打印异常 -> 将异常打印到日志文件中去
 *  }
 *
 * 特点：
 * a.如果try中有异常，就走catch捕获，如果捕获到了相当于处理了，没有捕获到相当于没有处理，就会默认往上抛，最终给jvm。
 * b.用try...catch,如果一个功能一旦触发了异常，就不会影响下面的功能执行
 * @Author Freya
 * @Create 2026/9/16
 */
public class Demo06Exception {
    public static void main(String[] args)  {
        String s = "abc.txt1";
        try{
            String str = null;
//            System.out.println(str.length()); //NullPointerException
            insert(s);
        }catch (FileNotFoundException e ){
            e.printStackTrace();//打印详细的异常信息
        }
        System.out.println("删除功能");
        System.out.println("修改功能");
        System.out.println("查询功能");
    }

    public static void insert(String s ) throws FileNotFoundException {

        if(!s.endsWith(".txt")){
            throw new FileNotFoundException("文件找不到");
        }

    }}
