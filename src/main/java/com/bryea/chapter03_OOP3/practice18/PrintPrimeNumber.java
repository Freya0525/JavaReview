package com.bryea.chapter03_OOP3.practice18;

/**
 * ClassName: PrintPrimeNumber
 * Package: com.atguigu.chapter03_OOP.practice17
 * Description:
 *
 * @Author Freya
 * @Create 2026/8/4
 */
public class PrintPrimeNumber extends Template{
    @Override
    public void code() {
        for (int i = 2; i < 10000; i++) {
            boolean isFlag=true;
            for (int j = 0; j < Math.sqrt(i); j++) {
                if(i %2 ==0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }
    }
}
