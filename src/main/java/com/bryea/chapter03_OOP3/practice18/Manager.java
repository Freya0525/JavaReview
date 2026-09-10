package com.bryea.chapter03_OOP3.practice18;
/**
 * ClassName: Manager
 * Package: com.atguigu.chapter03_OOP.practice16
 * Description:抽象类的子类
 *
 * @Author Freya
 * @Create 2026/7/23
 */
public class Manager extends Employee{
    private double bonus;

    @Override
    public void work(){
    }

    
    public Manager(String name,int id,double salary,double bonus){

        super(name,id,salary);

        this.bonus=bonus;

    }

    public double getBonus(){

        return bonus;

    }


    public void setBonus(double bonus){

        this.bonus=bonus;

    }
}
