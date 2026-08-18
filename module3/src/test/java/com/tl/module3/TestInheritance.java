package com.tl.module3;

/**
 * 测试继承
 */
public class TestInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat("小白");
        cat.Eat();

        Dog dog = new Dog("小黑");
        dog.Eat();

        dog.name = "XX";
        dog.Eat();

        System.out.println(dog.name.length()); // 本质调用String()引用类型的length()方法

    }
}
