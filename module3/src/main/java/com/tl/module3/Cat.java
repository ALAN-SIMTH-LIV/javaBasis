package com.tl.module3;

public class Cat extends Animal{  // 子类

    /**
     * 构造方法，父类构造方法无法直接调用，需要通过super()调用父类构造方法
     * @param name 动物名称
     */
    public Cat(String name) {
        super(name);
    }  // 子类继承父类的构造方法

    @Override  // 子类重写父类的方法
    void Eat() {
        System.out.println(name + "在吃鱼");
    }


}
