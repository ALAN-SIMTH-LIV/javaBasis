package com.tl.module3;

/**
 * 1.Try-catch 语句：用于捕获和处理异常。
 * 2.处理顺序 ：往上处理，直到找到匹配的 catch 块。
 * 3.运行时异常 ：在运行时抛出的异常，例如除数为0。
 * 4.编译时异常 ：在编译时抛出的异常，例如语法错误。
 * 5.异常处理：try-catch 语句可以捕获并处理异常，避免程序崩溃。
 * 6. finally 块：无论是否抛出异常，都会执行的代码。 使用场景： 文件流、数据库连接等。
 *
 */
public class TestTry {
    public static void main(String[] args) {

        try { // try 尝试 块：包含可能会抛出异常的代码  运行时异常
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) { // catch 捕获 块：捕获并处理异常
            System.out.println("除数不能为0 " + e); // 打印异常信息
        } finally {
            System.out.println("finally 块");
        }

        System.out.println("程序继续执行");

    }

    public static void test()  throws ArithmeticException {  // 编译时异常
        int a = 10;
        int b = 0;
        int c = a / b;
        System.out.println(c);
    }

}
