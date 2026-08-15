package com.tl.module3;

public class TestPhone {
    public static void main(String[] args) {
        // 创建对象时，调用构造方法
        Phone phone1 = new Phone("小米", "128GB", "6.5英寸", "白色", 3999);
        Phone phone2 = new Phone("华为", "128GB", "6.5英寸", "白色", 3999);
        Phone phone3 = new Phone("苹果", "128GB", "6.5英寸", "白色", 3999);

        // 修改对象的属性值
        phone1.price = 4999;
        System.out.println(phone1.price);

        // System.out.println(phone1.available); // 默认值 false



    }
}
