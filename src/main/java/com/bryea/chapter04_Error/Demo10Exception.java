package com.bryea.chapter04_Error;

/**
 * ClassName: Demo10Exception
 * Package: com.bryea.chapter04_Error
 * Description:
 *
 * @Author Freya
 * @Create 2026/9/16
 */
public class Demo10Exception {
    public static void main(String[] args) {
        int result = method();
        System.out.println(result);
    }

    public static int method(){
        try{
           String s = null;
            System.out.println(s.length());  // ① 抛出空指针异常
            return 2;                       //不执行
        }catch (Exception e ){
            return 1;                      // ② 准备返回 1
//            System.out.println("哈哈哈");
        }finally {
            System.out.println("我一定要执行");
            return 3;                    // ③ 覆盖返回值，最终返回 3
            /*
            关键点是：执行到 return 1 时，并不会立刻结束方法，而是：
            暂时保存返回值 1。
            检查是否有 finally。
            执行 finally。
            finally 又执行了 return 3。
            原来暂存的 1 被覆盖，最终返回 3。
             */
        }
    }
}
