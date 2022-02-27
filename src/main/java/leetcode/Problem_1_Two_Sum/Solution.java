package leetcode.Problem_1_Two_Sum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        var m = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(target - nums[i])) {
                return new int[]{m.get(target - nums[i]), i};
            } else {
                m.put(nums[i],i);
            }
        }

        return null;
    }
}