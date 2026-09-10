package com.bryea.chapter03_OOP1.practice5;

/**
 * ClassName: User
 * Package: com.atguigu.chapter03_OOP.oop.practice5
 * Description:用户类
 *
 * @Author Freya
 * @Create 2026/7/13
 */
/*
练习5(课下练习):用面向对象的方式编写用户登录程序。
用户类:
属性:用户名，密码
方法:登录
界面类:
在界面类中添加main方法，接受用户输入，并调用用户类的登录方法进行验证。。输出:
登录失败:用户名或密码错误!
登录成功:欢迎你，用户名!
 */
public class User {
    String userName;
    String password;

    /**
     * 实现登陆的判断
     * @param inputName
     * @param inputPwd
     */
    public void login(String inputName,String inputPwd){
        if(userName.equals(inputName) && password.equals(inputPwd)){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
    }


    /**
     * 实现用户登陆的判断
     * @param inputName
     * @param inputPwd
     * @return
     */
    public boolean login1(String inputName,String inputPwd){
        return userName.equals(inputName) && password.equals(inputPwd);
    }


}
