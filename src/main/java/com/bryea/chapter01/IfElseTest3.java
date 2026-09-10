package com.bryea.chapter01;/**
 * ClassName: IfElseTest3
 * Package: com.atguigu.chap01
 * Description:
 *
 * @Author Freya
 * @since 2026/5/9
 */

/**
 * @author Freya
 * @since 2026/5/9
 */

public class IfElseTest3 {
    public static void main(String[] args) {
        //1.对下列代码，若有输出，，指出输出结果。
        int x = 4 ;
        int y =1;
        if(x>y){
            System.out.println(x+y);
            System.out.println("x add y");
        }else{
            System.out.println("x is " + x );
        }



        //2.
        boolean b = true;
        if(b==false){
            System.out.println("b is false ");
        } else if (b) {
            System.out.println("b is " + b );
        } else if (!b) {
            System.out.println("b取反");
        }else {
            System.out.println("d");
        }
    }
}
