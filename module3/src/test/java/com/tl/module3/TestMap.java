package com.tl.module3;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map接口
 * Map接口是一个键值对(entry)集合，键是唯一的，值可以重复。
 * 1.映射关系：键(key) -> 值(value)
 * 2.两个泛型，分别限制键和值的类型。
 * 3.Map.of 方法：创建一个不可变的Map对象，参数为键值对。
 * 4.HashMap 类：可变的Map对象，内部使用哈希表实现。
 * 5.Map的增删改查操作：
 * 5.1.增：put 方法
 * 5.2.删：remove 方法
 * 5.3.改：put 方法，如果键已存在，则覆盖旧值
 * 6.查：get 方法，根据指定键获取对应的值。如果键不存在，则返回null
 * 7.遍历：增强For循环遍历Map对象
 */
public class TestMap {
    public static void main(String[] args) {

        Map<String, Integer> map1 = Map.of("a", 1, "b", 2);  // 创建一个不可变的Map对象

//        System.out.println(map1);

        Map<String,Integer> map2 = new HashMap<>();  // 可变的Map对象
        map2.put("a",1);
        map2.put("b",2); // put 方法：将键值对添加到Map中，如果键已存在，则覆盖旧值。如果键不存在，则创建新键值对。如果值为null，则删除该键值对
        map2.put("c",3);
        map2.remove("a"); // remove 方法：删除指定键对应的键值对
        System.out.println(map2.get("b")); // get 方法：根据指定键获取对应的值。如果键不存在，则返回null。
        System.out.println(map2);

        map2.entrySet(); // entrySet 方法：返回一个包含Map中所有键值对的Set集合

        System.out.println("-----------------");

        for (Map.Entry<String,Integer> e:map2.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

    }
}
