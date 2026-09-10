package com.bryea.chapter01;/**
 * ClassName: VariableTest1
 * Package: com.atguigu.chap01
 * Description:
 *
 * @Author Freya
 * @since 2026/5/8
 */

/**
 * @author Freya
 * @since 2026/5/8
 */

public class VariableTest1 {
    public static void main(String[] args) {
        /*
        基本数据类型：
        整数类型：byte 1byte=8bite  short 2byte=16bite  int 4byte=32bite long 8byte=64bite
        浮点型：单精度float float类型常量后面跟f，没有的就是默认double,尾数可以精确到7位有效数字   双精度double，精确有效数字是float的两倍。
        如果是不容许有误差的情况下，用BigDecimal
         */
//1.测试整数类型
        byte a = 1;
        System.out.println(a);
        byte a2 = 2;
        System.out.println(a2);
        byte a3 = 31 ;
        System.out.println(a3);
        byte a4 = 127;
        System.out.println(a4);
        //byte a5 = 128;
        //System.out.println(a5);  编译没通过是因为128是int不在byte范围内

        short b = 1234;
        //short b2 = 12341234324;  编译不通过是因为short：-32768 ~ 32767
        System.out.println(b);

        //int i = 12345676786; 编译不通过是因为2^31 - 1 = 2147483647，超了这个范围，那么这个值赋值给long类型试试
        //long i = 12345676786; //先编译右边，再编译左边，所以还没编译long i市就编译int类型的12345676786，发现超了int的范围所以报红，
        //如果想让它在编译字面量时就知道是Long类型，那就得数字后面加L。
        //① 声明long类型变量时，需要提供后缀。后缀为'l'或'L'
        long i = 12345676786L;
        System.out.println("i = " + i);
        //如果想要输出i变量的数据类型呢？------> 这就涉及到反射了，i变量无法直接获取数据类，对象才能调用方法获取数据类型
        //所以想让i自动装箱，变成一个对象，再获取数据类型
        Long i2 = i;
        System.out.println("i2.getClass() = " + i2.getClass());

        //② 开发中，大家定义整型变量时，没有特殊情况的话，通常都声明为int类型。

//1.测试浮点数类型
        //float f1 = 12.2223333;//编译不通过，同样的，先编译右边再编译左边，所以编译右边时foalt类型没有加f就会编译成double,
        //那么，既然右边编译成double，double → float可以类型转换呀？因为double → float的自动转换会丢失精度，这种转换必须显式强转
        //也就是你得手动转换。
        float f2 = 12.2223333f;
        //或者
        float f3 = (float)12.2223333;

        double d1= 12.3;
        double d2= 12.3333333333333333333333;
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        //② 开发中，大家定义浮点型变量时，没有特殊情况的话，通常都声明为double类型，因为精度更高。

        //③ float类型表数范围要大于long类型的表数范围。但是精度不高。

        //测试浮点型变量的精度
        //测试1
        System.out.println("0.1+0.2="+0.1+0.2);//0.10.2 这是字符串拼接
        System.out.println("0.1+0.2="+(0.1+0.2));//0.1+0.2=0.30000000000000004
        System.out.println(0.1+0.2);//0.30000000000000004
        float e1 = (float)(0.1+0.2);//0.3
        System.out.println("e1 = " + e1);


        //测试2
        float f4 = 123456719f;
        float f5 = f4 + 1;
        System.out.println("f4 = " + f4);
        System.out.println("f5 = " + f5);
        System.out.println(f4 == f5); //true,数字较大时精度不够导致的

        //结论：通过测试发现浮点型变量的精度不高。如果在开发中，需要极高的精度，需要使用BigDecimal类替换浮点型变量。




    }
}
