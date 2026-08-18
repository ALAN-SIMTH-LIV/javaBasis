package com.tl.module3;

import java.io.Serializable;

/**
 * JavaBean 规范 ：
 * 1. 字段私有，public方法 get set is
 * 2. 提供无参构造方法
 * 3. 实现 Serializable 接口
 *
 * 属性
 *
 */
public class JavaBean {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("张三");
        System.out.println(teacher.getName());
    }
}

class Teacher implements Serializable {
    private String name; // 小写

    public Teacher(){};

    public String getName() {  // get 方法， 获取属性值
        return name;
    }

    public void setName(String name) {  // set 方法， 设置属性值
        this.name = name;
    }
}
