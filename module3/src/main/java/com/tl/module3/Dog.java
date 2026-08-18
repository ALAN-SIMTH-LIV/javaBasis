package com.tl.module3;

public class Dog extends Animal{  // 子类

    public Dog(String name) {
        super(name);
    }  // 子类继承父类的构造方法

    @Override // 子类重写父类的方法
    void Eat() {
        System.out.println(name + "在吃狗粮");
        System.out.println("并叫了几声");
    }
}
