package com.bryea.chapter03_OOP3.practice18;

/**
 * ClassName: TemplateTest
 * Package: com.atguigu.chapter03_OOP.practice17
 * Description:
 *
 * @Author Freya
 * @Create 2026/8/4
 */
/*

 */
public class TemplateTest {
    public static void main(String[] args) {
        Template printPrimeNumber = new PrintPrimeNumber();
        printPrimeNumber.code();
        printPrimeNumber.spendTime();
    }
}

abstract class Template{
    //计算某段代码的执行，需要花费的时间
    public void spendTime(){
        long start = System.currentTimeMillis();

        code();
        long stop = System.currentTimeMillis();

        System.out.println("花费时间为"+( stop - start)+"秒");
    }

    public abstract void code();
}
