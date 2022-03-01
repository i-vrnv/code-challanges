package leetcode.Problem_219_Contains_Duplicate_2;

import java.util.HashMap;

/**
 * Runtime: 37 ms, faster than 57.96% of Java online submissions for Contains Duplicate II.
 * Memory Usage: 96.1 MB, less than 32.59% of Java online submissions for Contains Duplicate II.
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 2) return false;
        var alreadyChecked = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            var checkedIdx = alreadyChecked.get(nums[i]);

            if (checkedIdx != null) {
                if (Math.abs(checkedIdx - i) <= k) return true;
            }
            alreadyChecked.put(nums[i], i);
        }
        return false;
    }
}