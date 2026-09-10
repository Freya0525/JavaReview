package com.bryea.chapter03_OOP1.practice4;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name="小黑";
        e1.id=001;
        e1.age=24;
        e1.salary=13000;

       e1.show();
       //e1.show1();有返回值的情况下只调用不会输出结果，得接受才可以
        String result = e1.show1();
        System.out.println("result = " + result);

       //System.out.println(e1.show());//因为show()方法的返回值类型为void,
        //所以没有返回值，而且e1.show();里已经有System.out.println。

    }
}
