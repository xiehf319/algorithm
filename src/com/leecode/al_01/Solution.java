package com.leecode.al_01;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/
 */
public class Solution {

    /**
     * 哈希的思维
     *
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] sums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ints = solution.twoSum(sums, target);
        for (int anInt : ints) {
            System.out.print(anInt + ",");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
