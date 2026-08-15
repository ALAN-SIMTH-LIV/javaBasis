package com.tl;

import java.util.Scanner;  // 类的全路径名  java.lang 包不需要import导入

public class Test {
    public static void main(String[] args) {
        System.out.println("你好世界");


        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("你输入的内容是："+scanner.nextLine());

        System.out.println("""
                床前明月光,
                疑是地上霜.
                """);
// var 关键字 自动推导变量类型
        var scanner2 = new Scanner(System.in);

//  byte short int long float double 数字类型  String 字符串类型 char 字符类型 boolean 布尔类型  void 无返回值类型  其他类型

//        char c = 'c';
//        System.out.println(c);

        int a = 0;
        // ++com.tl.a 前置自增 先自增 再赋值
        // com.tl.a++ 后置自增 先赋值 再自增
        int b = a++; // com.tl.b = com.tl.a = 0 => com.tl.a = 1
        int c = ++a; // com.tl.a = com.tl.a + 1 = 2 => c = 2
        System.out.println(b+","+c+","+a);


//        if (com.tl.a == 1){
//            System.out.println("a等于1");
//        } else {
//            System.out.println("a不等于1");
//        }

        /*
        提高可读性  把错的情况先处理掉 再处理正确的情况
        */
        if (!(a == 2)){
            System.out.println("a不等于2");
            return;
        }
        System.out.println("a等于2");

        while (true){
            if (a < 10){
                System.out.print("com.tl.a="+a+" ");
                a++;
            } else {
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("i="+i+" ");
        }

        System.out.println("");

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
//            System.out.print("i="+i+" ");
            sum += i;
        }
        System.out.println("sum="+sum);

        System.out.println(add(0, 0));  // 实参
    }

    /**
     * 计算两个整数的和
     * @param a 第一个整数
     * @param b 第二个整数
     * @return com.tl.a+b的结果
     */
    public static String add(int a, int b){  // 形参

        if (a == 0 || b == 0){
            throw new IllegalArgumentException("a或b不能为0");
        }
        System.out.println("com.tl.a="+a+",com.tl.b="+b);
        return "com.tl.a+com.tl.b= "+(a + b);
    }

    // 很久没有学习了 我忏悔


}
