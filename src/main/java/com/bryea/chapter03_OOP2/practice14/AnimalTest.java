package com.bryea.chapter03_OOP2.practice14;

/**
 * ClassName: AnimalTest
 * Package: com.atguigu.chapter03_OOP.practice13
 * Description:
 *
 * @Author Freya
 * @Create 2026/8/4
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        Animal dog = new Dog();
        animalTest.adopt(dog);
        animalTest.adopt(new Cat());
    }
    public void adopt(Animal animal){ //Animal animal = new Cat();
        animal.eat();
        animal.jump();
    }
}
class Animal{
    public void eat(){
        System.out.println("动物进食");
    }
    public void jump(){
        System.out.println("动物跳");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("狗急跳墙");
    }

    //该类特有的方法
    public void watchDoor(){
        System.out.println("狗能看门");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void jump(){
        System.out.println("猫跳");
    }

    //该类特有的方法
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }

}
