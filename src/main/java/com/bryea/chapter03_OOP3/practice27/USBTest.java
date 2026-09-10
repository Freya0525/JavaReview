package com.bryea.chapter03_OOP3.practice27;

/**
 * ClassName: USBTest
 * Package: com.atguigu.chapter03_OOP.practice26
 * Description:
 *
 * @Author Freya
 * @Create 2026/8/3
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        USB printer = new Printer();
        computer.transferData(printer);

        //2.创建接口实现类的匿名对象
        computer.transferData(new Camera());

        //3.创建接口匿名实现类的对象
        USB usb = new USB(){
            @Override
            public void start() {
                System.out.println("U盘开始工作");
            }

            @Override
            public void stop() {
                System.out.println("U盘结束工作");
            }
        };
        computer.transferData(usb);

        //4.创建接口匿名实现类的匿名对象
        computer.transferData(
                new USB(){
                    @Override
                    public void start() {
                        System.out.println("扫描仪开始工作");
                    }

                    @Override
                    public void stop() {
                        System.out.println("扫描仪开始工作");
                    }
                }
        );
    }
}
interface USB{
    //声明常量
    //USB的长款、款、高。。。。


    //方法
    public abstract void start();
    void stop();

}

class Computer {
    public void transferData(USB usb){
        System.out.println("设备连接成功...");
        usb.start();
        System.out.println("数据传输中的细节");
        usb.stop();
        System.out.println(" ");



    }
}

class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
class Camera implements USB{
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机结束工作");
    }

}
