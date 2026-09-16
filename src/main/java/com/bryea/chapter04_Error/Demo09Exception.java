package com.bryea.chapter04_Error;

import java.io.FileNotFoundException;

/**
 * ClassName: Demo09Exception
 * Package: com.bryea.chapter04_Error
 * Description: finally关键字
 * 1.概述：不管有没有捕获到异常，都一定会走的代码块
 * 2.使用：配合try...catch使用
 * 格式：
 * try{
 *     可能出现异常的代码
 *  }catch(异常 对象名){
 *      异常处理方案 -> 直接打印异常 -> 将异常打印到日志文件中去
 *  }finally{
 *      不管是否捕获到异常都会执行的代码
 *  }
 *
 *  finally使用场景：
 *  finally中的代码一般都是用作释放资源使用 -> 说白了就是咱们的对象只要创建出来，后续代码是否执行成功我们最后都要将其释放，释放内存空间。
 *  为啥有的对象需要再finally中手动释放呢？堆内存中的对象，一般都是由GC(垃圾回收器)释放，但是有些对象GC是回收不了的，比如：Socket,IO流，数据库连接对象
 * @Author Freya
 * @Create 2026/9/16
 */
public class Demo09Exception {
    public static void main(String[] args)  {
        String s = "abc.txt";
        String t = "123";
        try{
//          int number = Integer.parseInt(s);
            int Number1 = Integer.parseInt(t);
            insert(s); //FileNotFoundException
        }catch (FileNotFoundException e ){
            e.printStackTrace();
        }catch (NumberFormatException e ){
            e.printStackTrace();
        }finally {
            int[] arr = new int[5];
//            System.out.println(arr[10]); //ArrayIndexOutOfBoundsException
            System.out.println("我一定会执行");
        }

        System.out.println("删除功能");
        System.out.println("修改功能");
        System.out.println("查询功能");
    }

    public static void insert(String s ) throws FileNotFoundException{

        if(!s.endsWith(".txt")){
            throw new FileNotFoundException("文件找不到");
        }

    }
}
