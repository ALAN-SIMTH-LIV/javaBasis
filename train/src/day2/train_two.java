package day2;

import java.util.*;

public class train_two {
    public static void main(String[] args) {
        // 最长无重复字符子串 测试用例： bbbbb 1 pwwkew 3 abcabcbb 3
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(); // 计算字符串长度
        Set<Character> set = new HashSet<>(); // 创建用于存储去重字符集合
        int maxLen = 0, left = 0, right = 0;  // 初始化最大长度，左指针，右指针

        while (right < n) { // 启动条件
            char ch = s.charAt(right);  // 从字符串中取字符
            // 如果当前字符已存在，收缩左边界
            while (set.contains(ch)) { // 判断窗口集合中是否存在当前字符ch
                set.remove(s.charAt(left)); // 删除窗口最左侧的字符
                left++; // 左指针右移，缩小窗口
            }
            set.add(ch); // 将当前字符加入窗口集合
            maxLen = Math.max(maxLen, right - left + 1); // 当前窗口长度和历史最大值对比，更新最大长度
            right++; // 右指针右移，扩大窗口
        }
        return maxLen; // 返回最大长度
    }
}
