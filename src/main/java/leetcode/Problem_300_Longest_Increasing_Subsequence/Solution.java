package leetcode.Problem_300_Longest_Increasing_Subsequence;

import java.util.Arrays;

/**
 * Runtime: 12 ms, faster than 39.37% of Java online submissions for Longest Increasing Subsequence.
 * Memory Usage: 37.5 MB, less than 47.46% of Java online submissions for Longest Increasing Subsequence.
 */
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }
        Arrays.sort(dp);
        return dp[dp.length - 1];
    }
}