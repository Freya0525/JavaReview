package com.bryea.chapter03_OOP3.practice32;

import java.sql.Array;
import java.util.ArrayList;

/**
 * ClassName: WrapperTest
 * Package: com.bryea.chapter03_OOP3.practice32
 * Description:
 *
 * @Author Freya
 * @Create 2026/9/11
 */
public class WrapperTest {
    public static void main(String[] args) {
        //基本类型
        int primitive = 80;

        //自动装箱： int -> Integer
        Integer wrapper = primitive;

        //自动拆箱：Integer -> int
        int result = wrapper;

        //字符串 --> int
        int i = Integer.parseInt("100");

        //字符串 --> Integer
        Integer valueOf = Integer.valueOf("200");

        //集合只能使用包装类
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(primitive);
        System.out.println(wrapper);
        System.out.println(result);
        System.out.println(valueOf);
        System.out.println(numbers);

        /*
        包装类就是把基本数据类型包装成对象类型，使其能够用于泛型、
        集合、允许 null，并提供类型转换等实用方法。
        */

        /*
        最需要掌握的四点是：
        int 对应 Integer，char 对应 Character。
        基本类型变成包装类叫装箱，包装类变成基本类型叫拆箱。
        包装类可能是 null，自动拆箱时可能出现 NullPointerException。
        比较包装类中的数值优先使用 equals()，不要依赖 ==。
         */
    }
}
