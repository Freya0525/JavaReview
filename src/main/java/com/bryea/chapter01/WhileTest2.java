package com.bryea.chapter01;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        /*
随机生成一个100以内的数，猜这个随机数是多少？

从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。

提示：生成一个[a,b] 范围的随机数的方式：(int)(Math.random() * (b - a + 1) + a)
*/

                //随机生成[0-100]
                int random = (int)(Math.random() * 100) + 1;
                System.out.println("random = " + random);
                //获取加农盘输入的数
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入数字：");
                int num= scanner.nextInt();

                //声明一个变量记录猜测数
                int guessCount=0;
                while(random!=num){
                    if(random<num){
                        System.out.println("你输入的数据太大了");
                    } else if (random>num) {
                        System.out.println("你输入的数据太小了");
                    }
                    System.out.println("请输入[0,100]的数字");
                    num= scanner.nextInt();
                    guessCount++;
                }

                //能结束结束，就意味着random和guess相等了
                System.out.println("恭喜你！猜对了！");
                System.out.println("共猜了" + guessCount + "次");


                scanner.close();
            }
        }


