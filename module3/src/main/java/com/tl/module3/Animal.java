package com.tl.module3;

public class Animal {  // 父类 单继承 Object 类 , 所有类的根类

    // 属性
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void Eat(){
        System.out.println(name + "在吃");
    }

}
