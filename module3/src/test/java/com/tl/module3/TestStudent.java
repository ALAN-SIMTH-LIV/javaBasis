package com.tl.module3;

public class TestStudent {
    public static void main(String[] args) {
        // 使用无参构造方法创建对象时，需要手动给属性赋值
        // 有参构造方法可以自动给属性赋值，不需要手动赋值
        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 18;
        System.out.println(stu1.name);
        System.out.println(stu1.age);
    }
}
