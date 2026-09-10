package com.bryea.chapter03_OOP2.practice13;

/**
 * ClassName: SmartPhone
 * Package: com.atguigu.chapter03_OOP.practice12
 * Description:继承extends
 *
 * @Author Freya
 * @Create 2026/7/19
 */
public class SmartPhone extends Phone {

    /**
     * 重写父类的通过功能的方法
     */
    @Override
    public void call() {
        System.out.println("语音通过 或 视频通话");
    }

    @Override
    public void showNum() {
        //来电显示姓名和图片功能
        System.out.println("来电显示姓名");
        System.out.println("显示头像");

        //保留父类来电显示号码的功能
        super.showNum();//此处必须加super，否则就是无限递归，那么就会栈内存溢出
    }






}
