package day2;

public class train_three {
    public static void main(String[] args) {
        // 接雨水
        int [] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1}; // 高度
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int left = 0; // 左指针
        int right = height.length - 1; // 右指针
        int leftMax = 0; // 左侧最大柱子高度
        int rightMax = 0; // 右侧最大柱子高度
        int ans = 0; // 累计雨水总量

        while (left < right) {
            // 如果左边柱子高度 < 右边柱子高度，处理左边位置
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // 更新左边最高柱子
                } else {
                    ans += (leftMax - height[left]); // 计算当前位置能接的雨水
                }
                left++; // 左指针向右移动
            } else {
                // 右边柱子 <= 左边柱子，处理右边位置
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // 更新右边最高柱子
                } else {
                    ans += (rightMax - height[right]); // 计算当前位置能接的雨水
                }
                right--; // 右指针向左移动
            }
        }
        return ans;
    }
}
