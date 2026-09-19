package com.bryea.chapter06_StringAndStringBuilder;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Stack;

/**
 * ClassName: TestString
 * Package: com.bryea.chapter06_StringAndStringBuilder
 * Description:
 *
 * @Author Freya
 * @Create 2026/9/18
 */
public class TestString {
    @Test
    public void test() {
        //1.字符串是对象
        String name = "Freya";
        //这里的"Freya"本身就是一个String对象，name保存的是该对象的引用。

        //2.字符串内容不可变。
        String str = "Hello";
         str = str + "world";
        System.out.println("str = " + str);
        //这段代码并没有修改原来的“Hello”,而是创建了新的字符串“hello world”,然后让str指向新对象。
        //因此：
        String name1 = "oliver";
        String concat = name1.concat("def");
        System.out.println("concat = " + concat);

        //3.相同的字符串可以共享
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1==s2); //true
        //因为字符串常量池中通常只保存一份“abc”,s1和s2指向同一个对象。
        //但不要使用 == 判断字符串内容，应该使用equals()

        System.out.println("------------------");
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3==s4); //false，比较的是地址值
        System.out.println(s3.equals(s4)); //比较的是字符串内容


    }

    @Test
    public void test1() {
        //4.String的常见创建方式
        //空字符串
        String s = new String();

        //根据已有字符创建
        String s1 = new String("abc");

        //byte 数组转换成字符串
        byte[] bytes = {1,2,3,4};
        String s2 = new String(bytes);
        /*
        byte[] → String不是把数字 1、2、3、4 拼成字符串 "1234"。
        byte[] bytes = {1, 2, 3, 4};
        String s2 = new String(bytes);

         */

        //char数组转换成字符串
        char[] chars = {'a','b','c','d'};
        String s3 = new String(chars);

        //最常用的
        String s4 = "abc";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

    }

    @Test
    public void test2() {
    //特殊注意
    /*
    new String(bytes)不是数字拼接，而是按照字符编码将字节解码成字符。
    */
    //byte 数组转换成字符串
    byte[] bytes = {1,2,3,4};
    String s2 = new String(bytes);
    System.out.println("s2 = " + s2);
    /*
    byte[] → String不是把数字 1、2、3、4 拼成字符串 "1234"。
    byte[] bytes = {1, 2, 3, 4};
    String s2 = new String(bytes);
    */
    }


   /**
    * @Description String常用方法
    * @author Freya
    *
    */
    @Test
    public void test3() {
      //创建字符串对象
      String str = "HelloWorld";

      //一、判断字符串
      //1.字符串比较内容
        System.out.println(str.equals("HelloWorld") ); //true
        System.out.println(str.equals("Helloworld") ); //false
        System.out.println(str.equalsIgnoreCase("Helloworld") );//true
        System.out.println(str.equalsIgnoreCase("helloworld") );//true

      //2.是否包含
        System.out.println("isContains:"+str.contains("Hello")); //true
        System.out.println("isContains:"+str.contains("ello")); //true


      //3.判断开头与结尾
        System.out.println("startwith : "+str.startsWith("H")); //true
        System.out.println("startwith : "+str.startsWith("Hel")); //true
        System.out.println("endstwith : "+str.endsWith("ld"));//true

      //实际开发中用于判断文件类型
        String fileName = "头像.png";
        if(fileName.endsWith(".png")){
            System.out.println("头像上传成功" );
        }
    }

    @Test
    public void test4() {
        //二、获取字符串内容
        String str ="abcdefg";

        //1.获取字符串长度
        System.out.println("str.length= " + str.length());

        //2.获取指定位置的字符
        System.out.println("str.charAt(2)=" + str.charAt(2));//

        //3.查找字符串的位置
        System.out.println("str.indexOf('b')=" + str.indexOf("b"));
        System.out.println("str.indexOf('ef')=" + str.indexOf("ef"));

        //4.截取字符串
        System.out.println("str = " + str.substring(1));//截取1号位置后面的字符
        System.out.println("str的2-4字符" + str.substring(2,4));
        /*
        substring(2, 5) 仍然遵守：
        含头不含尾：包含索引 2，不包含索引 5。
        */
    }

/**
 * @Description 字符串的转换功能
 * @author Freya
 */
    @Test
    public void test5() {
     //三、字符串的转换功能
    //1.String 转char数组
    String str = "substring";
        char[] charArray = str.toCharArray();
        //用增强for循环来遍历
        for (char c : charArray) {
            System.out.println("c = " + c);
        }

        //用charAt遍历也可以
        System.out.println("-------------");
        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            System.out.println("c1 = " + c1);
        }

        //2.String转byte[]
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("Arrays.toString(bytes) = "+ Arrays.toString(bytes));

        //String转byte[]时之——————字符串为中文
        String str1  ="你好";
        byte[] bytes1 = str1.getBytes(StandardCharsets.UTF_8);
        System.out.println("Arrays.toString(bytes1) = " + Arrays.toString(bytes1));
        //UTF-8 中，一个常见汉字通常占三个字节。
        System.out.println(" ");


        //字符串与字节之间可以互相转换
        //String --> byte[]
        byte[] bytes2 = str1.getBytes(StandardCharsets.UTF_8);
        System.out.println("Arrays.toString(bytes2) = " + Arrays.toString(bytes2));

        System.out.println(" ");
        //byte[] --> String
        String s = new String(bytes2, StandardCharsets.UTF_8);
        System.out.println("s = " + s);


        //四、字符串替换内容
        String s1 = "miracle-c#-javaScript-python";
        String replace = s1.replace("miracle", "java");
        System.out.println("s1 = " + s1);
        System.out.println("replace = " + replace);

        //也可以替换单个字符
        String result ="Freya".replace('F','P');
        System.out.println("result = " + result);


        //五、大小写转换
        String str2 = "JavaCourse";
        String lowerCase = str2.toLowerCase();
        String upperCase = str2.toUpperCase();
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("upperCase = " + upperCase);


        //六、去除首尾空白
        //strip()方法只去掉字符串开头和结尾的空白，不会去掉中间的空格，所以结果看起来没有变化。
        String str3 = " The Java course - on Coursera ";
        String strip = str3.strip();
        System.out.println("strip = " + strip);

    }
}






