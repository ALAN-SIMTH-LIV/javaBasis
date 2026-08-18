package com.tl.module3;

/**
 * 测试接口-解决单继承问题,多态性，封装   面向对象集大成者
 * 1. 需要放入接口的方法，必须加default关键字(默认方法)
 * 2. default方法可以有实现，也可以没有实现，但是不能有private关键字，只能用public关键字，可以省略
 */
public class TestInterFace {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.swim();
        d.fly();
        d.eat();
    }
}

interface Swimmable{  // 接口-游泳能力

    // 默认方法-游泳能力
    default void swim(){
        System.out.println("游泳");
    }

    // 抽象方法 只有方法名，没有方法体，必须有public关键字,public abstract关键字可以省略，抽象方法必须实现
    // public abstract void eat();
    void eat();

    // 抽象用的多
}

interface Flyable{  // 接口-飞行能力
    default void fly(){
        System.out.println("飞行");
    }
}

class Duck implements Swimmable,Flyable{  // 鸭子类-实现游泳和飞行能力
    @Override
    public void swim() {
        System.out.println("鸭子游泳");
    }

    @Override
    public void eat() {
        System.out.println("鸭子吃");
    }

    @Override
    public void fly() {
        System.out.println("鸭子飞行");
    }
}
