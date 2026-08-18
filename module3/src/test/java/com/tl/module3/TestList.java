package com.tl.module3;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试List接口
 */
public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(1);
        nums2.add(2);

        List<Integer> nums3 = List.of(1,2); // 不可变集合

        // ArrayList 和 List结合使用
        List<Integer> nums4 = new ArrayList<>();
        nums4.addAll(List.of(123,123));
        System.out.println(nums4);
    }
}
