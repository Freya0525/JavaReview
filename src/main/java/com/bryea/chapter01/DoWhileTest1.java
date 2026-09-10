package com.bryea.chapter01;
/**
 * ClassName: DoWhileTest1
 * Package: com.atguigu.chap01
 * Description:
 *
 * @Author Freya
 * @since 2026/5/14
 */


public class DoWhileTest1 {
    public static void main(String[] args) {
        //输出：1~100 所有奇数,并统计奇数个数,奇数总和.用 while和do-while 各写一遍
      //while
        int num=1;
        int count=0;
        int sum=0;
        while(num<100){
            if(num%2!=0){
                count++;
                sum+=num;
            }
            num++;
        }
        System.out.println("while奇数个数="+count);
        System.out.println("while奇数总和="+sum);

        //do-while
        int num1=1;
        int count1=0;
        int sum1=0;
        do{
          if(num1%2!=0){
              count1++;
              sum1+=num1;
          }
            num1++;
        }while(num1<100);
        System.out.println("do-while奇数个数="+count1);
        System.out.println("do-while奇数总和="+sum1);
    }
}
