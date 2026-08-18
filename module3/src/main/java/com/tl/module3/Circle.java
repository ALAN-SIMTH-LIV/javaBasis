package com.tl.module3;

public class Circle {

    double radius; // 半径

    // 静态变量 圆周率
    // static double PI = 3.14;
    // final 不可改变，只能在定义时赋值，不能在赋值后改变
    // final double PI = 3.14;

       Circle(double radius) {
        this.radius = radius;
    }

    /**
     * 计算圆的面积
     * @return 圆的面积
     */
    double Area(){
        return Math.PI * radius * radius;
    }

}
