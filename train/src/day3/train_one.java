package day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class train_one {
    public static void main(String[] args) {
        // 两数之和
        int [] nums = new int[]{11,15,2,7}; // 0 1 2 3
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>(); // 空Map
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];  // 9 - 2 = 7   9 - 7 = 2   9 - 11 = -2   9 - 15 = -6
            if (map.containsKey(temp)){   //   0              1            2             3
                return new int[]{map.get(temp),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
