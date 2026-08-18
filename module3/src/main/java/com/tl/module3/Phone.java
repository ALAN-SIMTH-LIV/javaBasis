package com.tl.module3;

public class Phone {
    // 类型 名字
    String brand; // 品牌
    String memory; // 内存
    String size; // 尺寸
    String color; // 颜色
    double price; // 价格

    // 构造方法
    // 1.和类同名 2.不返回值
    Phone() {}

    // 有参构造方法
    public Phone(String brand, String memory, String size, String color, double price) {
        // 字段名 = 参数名;
        // this代表当前对象的属性
        this.brand = brand;
        this.memory = memory;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    boolean available; // true 上架 false 下架

}
