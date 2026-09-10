package com.bryea.chapter01;


public class ForTest5 {
    public static void main(String[] args) {
        //求1~100 之间能被3整除的数，并统计个数。使用 continue。
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%3!=0){
                continue;
            }
            count++;
            System.out.println("i = " + i);
        }
        System.out.println("count = " + count);
    }


}
