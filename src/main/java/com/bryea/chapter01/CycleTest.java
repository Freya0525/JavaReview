package com.bryea.chapter01;/**
 * ClassName: CycleTest
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

/*

概念：循环语句具有在某些条件满足的情况下，反复执行特定代码的功能。
循环结构分类：
。for循环
。while循环
。do-while循环
循环四要素：
。初始化部分
。循环条件部分
。循环体部分
。迭代部分

循环分支
for


while



do-while
do-while至少循环一次。
for、while、ddo-while循环三者之间是可以相互转换的。

 */
public class CycleTest {
    public static void main(String[] args) {
        //----用for------需求3：遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
        int count = 0;//偶数个数
        int sum=0;//偶数和
        for(int i=1; i<=100;i++){
            if(i%2==0){
                count = count + 1;
                sum = sum + i;
            }
        }
        System.out.println("for---偶数个数=" + count);
        System.out.println("for----偶数总和 = " + sum);

        //用While-----需求3：遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
        int num =1;
        int count1 = 0;
        int sum1=0;
        while(num<=100){
            if(num%2==0){
                count1 ++;
                sum1 = sum1+num;
            }
            num ++;

        }
        System.out.println("while---偶数个数=" + count1);
        System.out.println("while----偶数总和 = " + sum1);

        //用do-While-----需求3：遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
        int num2=1;
        int count2 = 0;
        int sum2 = 0;
        do{
           if(num2%2==0){
               count2++;
               sum2=sum2+num2;
           }
            num2++;
        }while(num2<=100);
        System.out.println("do-while---偶数个数=" + count2);
        System.out.println("do-while----偶数总和 = " + sum2);
    }
}
