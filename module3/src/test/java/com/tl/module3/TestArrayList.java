package com.tl.module3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 测试ArrayList ,解决数组长度固定的问题
 */
public class TestArrayList {
    public static void main(String[] args) {

        // String[] arr = {"a", "b", "c", "d", "e"};

        // System.out.println(Arrays.toString(arr));  更好的查看数组值的方法 ，比for循环更方便

        ArrayList list1 = new ArrayList(5);  // 默认初始容量 10
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        // 内部扩容逻辑  新容量 = 旧容量 * 1.5 向下取整
        list1.add("f");

        System.out.println(list1);

        // 遍历ArrayList ,增强For循环
        for (Object i:list1){
            System.out.println(i);
        }

        // 遍历数组 ,增强For循环
        String[] arr = {"a", "b", "c", "d", "e"};
        for (String i:arr){
            System.out.println(i);
        }

        System.out.println("-----------------");

        ArrayList<Integer> list2 = new ArrayList<>(); // 泛型指定为Integer类型
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        int sum = 0;
        for(Integer i:list2){
            sum += i;
        }
        System.out.println(sum);


    }
}
