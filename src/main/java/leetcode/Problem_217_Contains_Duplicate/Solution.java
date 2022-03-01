package leetcode.Problem_217_Contains_Duplicate;

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) return false;
        var s = new HashSet<Integer>();
        for (int n : nums) {
            if (s.contains(n)) return true;
            s.add(n);
        }
        return false;
    }
}
