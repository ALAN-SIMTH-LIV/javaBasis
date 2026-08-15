package com.tl.moudle2;

/**
 * 测试数组, 可以存储多个值
 * Array 数组的类型
 * 1.类型 [] 数组名 = new 类型[数组长度]
 * 2.类型 [] 数组名 = new 类型[]{元素1,元素2,元素3...}
 * 3.类型 [] 数组名 = {元素1,元素2,元素3...}
 */

public class TestArray {
    public static void main(String[] args) {
        // new int[10] // 创建数组，数组长度为10
        // new String[10] // 创建数组，数组长度为10，数组元素为String类型

        String [] names = new String[2];
        names[1] = "你好"; // 元素, 索引为1
        names[0] = "Nick"; // 元素, 索引为0

        System.out.println(names[0]);
        System.out.println(names[1]);

        String [] names2 = new String[]{"不好","ls"};
        System.out.println(names2[0]);
        System.out.println(names2[1]);

        String [] names3 = {"你是","ls"};
        System.out.println(names3[0]);
        System.out.println(names3[1]);



    }
}
