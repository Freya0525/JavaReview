package com.bryea.chapter03_OOP3.practice19;

/**
 * ClassName: TestInterface
 * Package: com.atguigu.chapter03_OOP.practice18
 * Description: 测试接口
 *
 * @Author Freya
 * @Create 2026/7/24
 */
public class TestInterface {
    public static void main(String[] args) {
        Bird bird = new Bird(); //"我只接受Bird"
        //bird.fly();
        Plane plane = new Plane();
        plane.fly();

        Fly f1 = new Bird();//"我不关心你是谁，我只关心你会不会飞"
        f1.fly();


        TestInterface t = new TestInterface();
       t.testFly(bird);
        t.testFly(plane);
    }
    public void testFly(Fly f){
        f.fly();
    }
}
