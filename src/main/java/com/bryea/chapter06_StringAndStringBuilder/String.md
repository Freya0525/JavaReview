# String类
1. String 是什么？
String 类用于表示字符串。Java 中所有使用双引号包裹的内容，都是 String 对象：
   String name = "张三";
   String message = "Hello Java";

2.String 的三个重要特点
字符串是对象
String str = "abc";
这里的 "abc" 本身就是一个 String 对象，str 保存的是对该对象的引用。
字符串内容不可改变
String str = "hello";
str = str + " world";
这段代码并没有修改原来的 "hello"，而是创建了新的字符串 "hello world"，然后让 str 指向新对象。
因此：
String str = "abc";
str.concat("def");
System.out.println(str); // abc
必须接收返回值：

str = str.concat("def");

System.out.println(str); // abcdef
相同的字符串字面量可以共享
String s1 = "abc";
String s2 = "abc";

System.out.println(s1 == s2); // true
因为字符串常量池中通常只保存一份 "abc"，s1 和 s2 指向同一个对象。
但不要使用 == 判断字符串内容，应该使用 equals()：
String s1 = new String("abc");
String s2 = new String("abc");

System.out.println(s1 == s2);      // false，比较地址
System.out.println(s1.equals(s2)); // true，比较内容