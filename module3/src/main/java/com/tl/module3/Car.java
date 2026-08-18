package com.tl.module3;

/**
 * 访问修饰符 ： public, protected, default(默认访问修饰符), private
 * 访问修饰符的权限从大到小 ： public > protected > default > private
 */
public class Car {

    private int y;  // 私有属性， 只能在本类中访问

    public  int x;  // 公共属性， 可以在任何地方访问

    protected int z;  // 受能在本类和子类中访问

    int w;  // 默认访问修饰符， 可以在任何地方访问


}
