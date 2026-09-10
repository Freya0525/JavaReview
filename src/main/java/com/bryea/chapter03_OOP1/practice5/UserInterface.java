package com.bryea.chapter03_OOP1.practice5;

import java.util.Scanner;

/**
 * ClassName: UserInterface
 * Package: com.atguigu.chapter03_OOP.oop.practice5
 * Description:用户界面类
 *
 * @Author Freya
 * @Create 2026/7/13
 */

public class UserInterface {
    public static void main(String[] args) {
        User user = new User();
        user.userName="Freya";
        user.password="123456";

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scanner.next();
        System.out.println("请输入密码：");
        String pwd = scanner.next();

        //方式1:
        //user.login(name,pwd);

        //方式2:
        Boolean result =user.login1(name,pwd);
        if(result){
            System.out.println("登陆成功：欢迎你，"+user.userName);
        }else {
            System.out.println("登陆失败：用户名或密码错误！");
        }

        scanner.close();

    }
}
