package com.tl.module3;

public class TestAnimal {
    // 如果同一个方法执行时，表现出了不同的行为， 就叫多态
    // 多态的条件： 1. 子类重写了父类的方法 2. 父类引用指向子类对象
    // 方法的重写 ： 子类重写了父类的方法， 但是方法的参数列表和返回值类型要和父类的方法一致
    // 执行顺序 ： 先执行子类的方法， 再执行父类的方法
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat("小白"), new Dog("小白")};
        for (Animal animal : animals) {
            animal.Eat();
        }
    }
}
