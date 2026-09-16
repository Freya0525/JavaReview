package com.bryea.chapter04_Error;

import java.io.FileNotFoundException;

/**
 * ClassName: Demo04Exception
 * Package: com.bryea.chapter04_Error
 * Description:异常处理方式————throws
 * 格式：在参数后面 -> throws异常
 * 作用：往上抛异常
 * 弊端：如果无脑往上抛，会出现因为一个功能，而导致其他下面的功能都废了。
 * @Author Freya
 * @Create 2026/9/16
 */

public class Demo04Exception {
    public static void main(String[] args) throws FileNotFoundException {
        String s = "abc.txt1";
        insert(s); //FileNotFoundException
        System.out.println("删除功能");
        System.out.println("修改功能");
        System.out.println("查询功能");
        //用throws抛异常的弊端就是，无脑往上抛，在项目当中因一个小问题出现异常，项目终止运行，导致后面的功能都无法执行。
    }



    /**
     * @Description 创建异常类对象
     * 用到了一个String类中的方法：
     * 判断字符串是否以指定的串儿结尾
     * 比如“hello.txt".endsWith(".txt") ->true
     * @author Freya
     */
    public static void insert(String s ) throws FileNotFoundException {
        if(!s.endsWith(".txt")){
            throw new FileNotFoundException("文件找不到");
            //option+enter 选择 add exception to method signature
        }
        System.out.println("hehehehe");
    }
}
