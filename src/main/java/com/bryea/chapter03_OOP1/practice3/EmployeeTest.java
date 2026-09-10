package com.bryea.chapter03_OOP1.practice3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name="小黑";
        e1.id=001;
        e1.age=24;
        e1.salary=13000;
        MyDate date = new MyDate();
        date.year=1999;
        date.month=05;
        date.day=25;
        e1.birth=date;

        System.out.println("e1.name = " + e1.name+", e1.id="+e1.id+
                ", e1.age="+e1.age+", e1.salary="+e1.salary+", e1.birth:"
                +e1.birth.year+"年"+e1.birth.month+"月"+e1.birth.day+"日");


        Employee e2 = new Employee();
        e2.name="小红";
        e2.id=002;
        e2.age=25;
        e2.salary=12000;
        e2.birth = new MyDate();
        e2.birth.year=2000;
        e2.birth.month=07;
        e2.birth.day=01;

        System.out.println("e2.name = " + e2.name+", e2.id="+e2.id+
                ", e2.age="+e2.age+", e2.salary="+e2.salary+"e2.birth:"
                +e2.birth.year+"年"+e2.birth.month+"月"+e2.birth.day+"日");
    }
}
