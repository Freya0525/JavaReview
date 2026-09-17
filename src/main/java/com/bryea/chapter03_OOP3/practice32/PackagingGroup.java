package com.bryea.chapter03_OOP3.practice32;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * ClassName: PackagingGroup
 * Package: com.bryea.chapter03_OOP3.practice32
 * Description:
 *
 * @Author Freya
 * @Create 2026/9/11
 */
public class PackagingGroup {
    public static void main(String[] args) {
        //3. 为什么需要包装类？
        //原因一：集合只能保存对象类型
        //泛型不能写基本数据类型：
       // ArrayList<int> numbers;//错误
        //必须写：
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
        //这里集合声明的是 Integer，但是我们添加的是 int,Java 会自动把 10 从 int 转换成 Integer。

        //原因二：包装类可以表示 null
        //int age = null; // 错误
        Integer age1 = null;


        //原因三：包装类提供了实用方法
        //把字符串转换为数字：
        String text = "80";
        int number = Integer.parseInt(text);
        System.out.println(number + 20);
        //获取最大值和最小值：
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //进制转换：
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(255));

        //4.装箱与拆箱
        //基本类型和包装类之间可以相互转换。
        //装箱：基本类型转换成包装类
        int number1 = 80;
        Integer wrapper = Integer.valueOf(number1);
        //这个过程叫做装箱：int --Integer


        //拆箱：包装类转换成基本类型
        Integer wrapper1 = Integer.valueOf(80);
        int number2 = wrapper.intValue();
        //这个过程叫拆箱，Integer ---> int

        //其他包装类也有类似的方法：
        Byte b = Byte.valueOf((byte) 10);
        byte byted = b.byteValue();
        Double d = Double.valueOf(3.14);
        double value = d.doubleValue();
        Boolean b1 = Boolean.valueOf(true);
        boolean value1 = b1.booleanValue();
        Character c = Character.valueOf('A');
        char c1 = c.charValue();

        //5.自动装箱与自动拆箱
        //从java5开始，java可以自动完成装箱和拆箱。
        //编译器会自动装箱与拆箱

        //6.字符串与包装类之间的转换
        //字符串转化成基本类型
        int age = Integer.parseInt("20");
        double aDouble = Double.parseDouble("19.99");
        boolean flag = Boolean.parseBoolean("true");
        long parseLong = Long.parseLong("10001");
        //这些方法返回基本数据类型
        //如果字符串格式不正确，就会抛出异常：
        //int number3 = Integer.parseInt("abc"); //NumberFormatException


        /*
        注意：包装类可以保存null
        但如果对它进行自动拆箱，就会出现空指针异常：

         */
        Integer number4 = null;
        int result = number;
        //相当于
       // int value2 = number4.intValue(); //NullPointerException

        //7. 包装类比较时为什么不能随便用 ==？
        //这是包装类最容易踩坑的地方。
        Integer a = 100;
        Integer b2 = 100;

        System.out.println(a == b2); // true
        //但是
        Integer a1 = 200;
        Integer b3 = 200;

        System.out.println(a == b3); // 通常是 false

        /*
        这是因为：
        == 比较两个引用是否指向同一个对象
        equals() 比较包装类中的数值是否相同
        Java 默认缓存了部分常用的 Integer 对象，通常是 -128～127
        因此 100 可能使用缓存中的同一个对象，而 200 通常创建不同对象。
         */

        //正确比较数值：
        Integer a2 = 200;
        Integer b4 = 200;

        System.out.println(a2.equals(b4)); // true

        //8.包装类是不可变对象
        //包装类对象创建后，其内部数值不能被修改。
        Integer number5 = 10;
        number5 =20;
        System.out.println(" number5 = "+number5);
        //这并不是把原来的 Integer(10) 改成了 20，而是让变量 number 改为引用另一个表示 20 的对象。
        //原来：number → Integer(10)
        //后来：number → Integer(20)
        //原来的对象本身没有被修改。
        //Byte、Short、Integer、Long、Float、Double、Boolean 和 Character 都是不可变类。
    }
}
