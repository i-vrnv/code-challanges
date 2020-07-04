package leetcode.Problem_217_Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Time complexity :
 * O(n). We do search() and insert() for n times and each operation takes constant time.
 *
 * Space complexity :
 * O(n). The space used by a hash table is linear with the number of elements in it.
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) return false;

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}