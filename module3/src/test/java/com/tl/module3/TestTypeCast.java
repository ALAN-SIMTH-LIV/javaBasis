package com.tl.module3;

public class TestTypeCast {
    public static void main(String[] args) {


        // 类型转换
        // 1.基本类型转换 2. 包装类与基本类型转换 3. 引用类型之间 4. 其他
        // 布尔类型不能转换为其他类型

        // 隐式类型转换 , 低精度类型转换为高精度类型 , 会自动转换
        byte a = 10;
        int b = a;

        // 显式类型转换, 强制类型转换 , 注意: 转换时, 会丢失精度
        int c = 20;
        byte d = (byte) c;

        // 包装类与基本类型转换
        int e = 30;
        Integer f = e;

        // 引用类型之间转换，对象还是原对象 要符合 is a 关系
        // 隐式类型转换
        Animal animal = new Cat("小白");
        Object obj = new Cat("小黑");
        // 显式类型转换
        Cat cat = (Cat) obj;

        System.out.println(cat.getClass());

        // 对象 instanceof 类型，检查对象是否是某个类的实例 是否符合 is a 关系
        System.out.println(obj instanceof Cat);
        System.out.println(obj instanceof Animal);

        // 其他，借助转换方法 String -> int (要合法数字)



    }
}
