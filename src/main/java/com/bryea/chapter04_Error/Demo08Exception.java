package com.bryea.chapter04_Error;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: Demo08Exception
 * Package: com.bryea.chapter04_Error
 * Description:异常处理方式二：多个catch
 * 格式：
 * try{
 *     可能出现异常的代码
 *  }catch(异常 对象名){
 *      异常处理方案 -> 直接打印异常 -> 将异常打印到日志文件中去
 *  }catch(异常 对象名){
 *      异常处理方案 -> 直接打印异常 -> 将异常打印到日志文件中去
 *  }catch(异常 对象名){
 *      异常处理方案 -> 直接打印异常 -> 将异常打印到日志文件中去
 *  } ...
 *
 * 注意：
 *  如果catch的多个异常之间有子父类继承关系，我们可以直接catch父类异常。
 * @Author Freya
 * @Create 2026/9/16
 */
public class Demo08Exception {
    public static void main(String[] args)  {
        String s = "abc.txt11";
        String t = "123";
        try{
//            int number = Integer.parseInt(s);
            int Number1 = Integer.parseInt(t);
            insert(s); //FileNotFoundException
        }catch (FileNotFoundException e ){
            e.printStackTrace();
        }catch (NumberFormatException e ){
            e.printStackTrace();

        }

        /*
        不同输入会走不同的 catch：
        如果字符串不能转为整数，就进入 NumberFormatException。
        如果整数转换成功，但 insert() 抛出文件异常，就进入 FileNotFoundException。
        如果没有异常，就不进入任何 catch。
        一次执行最多进入其中一个 catch。
         */

        System.out.println("删除功能");
        System.out.println("修改功能");
        System.out.println("查询功能");
        //用throws抛异常的弊端就是，无脑往上抛，在项目当中因一个小问题出现异常，项目终止运行，导致后面的功能都无法执行。
    }

    public static void insert(String s ) throws FileNotFoundException{

        if(!s.endsWith(".txt")){
            throw new FileNotFoundException("文件找不到");
            //option+enter 选择 add exception to method signature
        }
        System.out.println("hehehehe");
    }
}
