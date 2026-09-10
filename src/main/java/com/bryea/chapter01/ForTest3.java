package com.bryea.chapter01;/**
 * ClassName: ForTest3
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

public class ForTest3 {
    public static void main(String[] args) {
        //求1~100 之间能被3整除的数，并统计个数。使用 continue。
        int count=0;
        for(int i=0;i<100;i++){
        if(i%3!=0){
            continue;

        }
            count++;
        }
        System.out.println("count="+count);
    }
}
