package com.bryea.chapter02_Array;
/*
二维数组
元素的数据类型[][] 二维数组的名称

 */
public class ArrayTest8 {
    public static void main(String[] args) {
        //存储多组成绩
        int[][] grades;

        //存储多组姓名
        String[][] names;

        //声明二维数组方式1:
        int[][] arr = new int[][]{{1,2},{3,4}}; //

        //声明二维数组方式2:
        int[][] arr1 = new int[][]{{1,2,3},{5,6}};

        //声明二维数组方式3:
        int[][] arr2;
        arr2 = new int[][]{{1,2},{3,4}};

        //声明二维数组方式4:先声明 再赋值
        int[][] arr3 = new int[2][2];//有2个一维数组，每个一维数组有2个元素
        //单独赋值
        //arr3[0][0] = 1;
        //arr3[1][1] = 2;
        //一次性赋值
        arr3 = new int[][]{
                {1,2},
                {3,4}
        };
        //再遍历看看
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println("arr3[i]"+i+"arr[j]"+arr3[i][j]+" ");
            }
        }



        //面试题：
        //int[] x, y[];
        //等价于
        int[] x;
        int[][] y;


    }
}
