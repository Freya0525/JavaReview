package com.bryea.chapter01;

/*
再次复习for循环
循环结构之一：for
1.java中规范了3种循环结构：for、while、do-while
2.凡是循环结构就一定会有4个要素：
(1)：初始化条件
(2)：循环条件---->
(3)：循环体
(4)：迭代部分

for循环：
for(1:2:3){
3
}

执行过程：1-2-3-4-2-3-4。。。。。。
初始化条件不一定是固定值，但必须是可计算、可赋值的表达式。
比如：for(i>0; i<10; i++ ){
//❌ ，i>0是条件，不是赋值。
}
 */
public class ForTest4 {
    public static void main(String[] args) {
        //题目1：输出5行HelloWorld
        for (int i = 0; i < 6 ; i++) {
            System.out.println("HelloWorld " +i);
        }

        //题目2:遍历1-100以内的偶数，并获取偶数个数，获取所有的偶数的和
        int count = 0; //偶数个数
        int sum = 0; //偶数的和
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                count+=1;
                sum=i+sum;
            }
        }
        System.out.println("count = "+count);
        System.out.println("sum = "+sum);
    }
}
