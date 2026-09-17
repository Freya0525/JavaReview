# 基础API
## 1.BigInteger
1.概述：BigInteger 是 Java 官方提供的一个类，用来表示特别大的整数。（java.math.BigInteger）
（BigInteger不是基本数据类型，也不是对象，是一个数学工具类java.math.BigInteger）

当整数超大时用BigInteger类表示，将数字写成字符串，如下：
BigInteger number = new BigInteger("12121212121212121212121212121212121");

2. 为什么需要 BigInteger？
   因为基本数据类型的容量有限。
   int 最大只能保存： 2147483647
   long 最大只能保存： 9223372036854775807
   例如：
   long number = 999999999999999999999999999999L;
   编译时就会报错，因为这个数字超过了 long 的范围。
   但是现实中可能需要计算：
   2 的 1000 次方
   几百位整数之间的加减乘除
   这时就需要 BigInteger：
   BigInteger number =
   new BigInteger("999999999999999999999999999999");
   它理论上能保存多大的整数，主要取决于计算机内存。

3. 为什么它必须是一个对象？
   CPU可以直接处理 int 和 long，但它们的位数固定：
   int   32 位
   long  64 位
   一个几百位的整数，CPU无法把它当作一个普通整数直接运算。
   BigInteger 内部会把大整数拆开保存。你现在可以把它想象成：
   123456789012345678901234567890
   ↓
   [123456789] [012345678] [901234567] [890...]
   真正的内部实现比这个复杂，但核心思想相同：把超大整数拆成若干部分，放在数组等结构中，然后通过程序实现加减乘除。
   因此，*`BigInteger 不是一种新的基本数据类型，而是把“超大整数的数据和运算规则”封装起来的类。`*

4. 为什么不能使用 + - * /？
   因为 + 支持基本数据类型。
   但 BigInteger 是对象，Java 不支持使用 + 对两个普通对象做数学加法,对象就要调用对应的方法来实现运算。

5. 为什么创建时一般传字符串？
   假设要保存一个非常大的整数：
   BigInteger number = new BigInteger("999999999999999999999999");
   字符串中的数字有双引号：
   "999999999999999999999999"
   *Java 会先把它当作普通文本，所以不会发生整数超出范围的问题。BigInteger 再读取这些字符，构造出大整数对象。
   如果不加双引号：*
   new BigInteger(999999999999999999999999);
   Java 必须先把括号里的内容识别为普通整数，但它早已超过 long 的范围，因此还没来得及创建 BigInteger，编译就失败了。
 

## 2.BigDecimal

1.概述：BigDecimal 是用来精确表示和计算小数的类。
2.为什么需要它：为了解决浮点数精度损失问题
先看看 double 的问题：
double a = 0.1;
double b = 0.2;

System.out.println(a + b);
应输出： 0.3
实际上可能输出： 0.30000000000000004
这叫浮点数精度损失。
原因是计算机使用二进制保存数字，一些十进制小数无法被二进制精确表示。类似十进制无法有限地表示：
1 ÷ 3 = 0.333333...
在二进制中，0.1 也会变成无法写完的数字，只能保存近似值。
使用 BigDecimal
BigDecimal a = new BigDecimal("0.1");
BigDecimal b = new BigDecimal("0.2");

BigDecimal result = a.add(b);

System.out.println(result); // 0.3
这次可以得到精确的： 0.3

BigDecimal既可以表示整数，也可以表示小数。


## 3.Date日期类
1.概述：Date 是 Java 用来表示某个时间点的类，完整类名是：java.util.Date

2.创建当前时间对象
例如现在是：
2026年9月17日 15:30:00
这个具体时刻就可以用一个 Date 对象表示：
Date date = new Date();

3.时间原点
计算机保存时间时，不适合直接保存： 2026年9月17日15时30分
它通常将时间转换成一个整数，也就是：*当前时间与时间原点之间相差的毫秒数。*

Java 使用的时间原点是：
1970年1月1日 00:00:00

4.什么是时间毫秒值？
假设从时间原点经过了 1 秒：
1970-01-01 00:00:01
对应的时间毫秒值就是： 1000
因为： 1秒 = 1000毫秒

5.根据时间毫秒值创建 Date
Date date = new Date(1000L);

System.out.println(date);
0L 表示距离时间原点为 1000 毫秒，也就是时间原点本身。

6.获取 Date 的时间毫秒值
使用： long getTime()
示例：
Date date = new Date();
long time = date.getTime();

System.out.println(time);
可能输出： 1789630200000
这个数字表示：
从 1970 年时间原点到 date 所表示的时间，一共经过了多少毫秒。

## 4.Calendar 日历类
1.概述：Calendar 用于获取和修改日期中的年、月、日等字段。java.util.Calendar

它是抽象类，不能直接 new Calendar()，需要这样获取对象：
Calendar calendar = Calendar.getInstance();

