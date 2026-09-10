package com.bryea.chapter03_OOP1.practice2;

public class Person {
  //属性 <=> （或成员变量）<=> 实例变量
  String name; //姓名
  int age; //年龄
  char gender; //性别

  //方法
  public void eat(){
    String food = "宫保鸡丁";
      System.out.println("我要吃"+food);
  }

  public void sleep(int hour){
      System.out.println("人至少保证睡"+hour+"小时");
  }

  public void interest(String hobby){
    System.out.println("我的爱好是"+ hobby);
  }

}
