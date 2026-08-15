package com.tl.module2;

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

        // 1. 数组长度
        int [] nums = new int[]{1,2};
        System.out.println("数组长度为：" + nums.length);

        // 2. 数组越界
        // nums[2] = 100; // 报错，数组越界 从 0 开始，所以最大索引为 1
        // ArrayIndexOutOfBoundsException 数组索引越界异常

        // 3. 遍历数组
        for (int i = 0; i < nums.length; i++) {
            System.out.println("数组元素为：" + nums[i]);
        }

        // 4. 默认值
        int [] nums2 = new int[2];
        System.out.println("数组元素为：" + nums2[0]);
        System.out.println("数组元素为：" + nums2[1]);
        String [] names4 = new String[2];
        System.out.println("数组元素为：" + names4[0]);
        System.out.println("数组元素为：" + names4[1]);
        boolean [] bools = new boolean[2];
        System.out.println("数组元素为：" + bools[0]);
        System.out.println("数组元素为：" + bools[1]);
        double [] nums3 = new double[2];
        System.out.println("数组元素为：" + nums3[0]);
        System.out.println("数组元素为：" + nums3[1]);
        char [] chars = new char[2];
        System.out.println("数组元素为：" + chars[0]);
        System.out.println("数组元素为：" + chars[1]);
        byte [] bytes = new byte[2];
        System.out.println("数组元素为：" + bytes[0]);
        System.out.println("数组元素为：" + bytes[1]);

        System.out.println("-----------------");

        // 多维数组
        // String [][] 变量名 = new String[外层长度][内层长度];
        String [][] names5 = new String[][]{{"你好","Nick"},{"你是","ls"}};
        System.out.println("多维数组元素为：" + names5[0][0]);
        System.out.println("多维数组元素为：" + names5[0][1]);
        System.out.println("多维数组元素为：" + names5[1][0]);
        System.out.println("多维数组元素为：" + names5[1][1]);



    }
}
