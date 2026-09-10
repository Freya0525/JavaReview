package com.bryea.chapter03_OOP3.practice18;

/**
 * ClassName: Eemployee
 * Package: com.atguigu.chapter03_OOP.practice16
 * Description:抽象类
 *
 * @Author Freya
 * @Create 2026/7/23
 */
public abstract class Employee {
    private String  name;
    private int id;
    private double salary;
    public abstract void work();

    public Employee(){};
    public Employee(String name , int id, double salary){
        this.name=name;
        this.id= id;
        this.salary=salary;
    }

    public String  getName(){
        return name;
    }

    public void setName(String name){
        this.name = name ;
    }
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
