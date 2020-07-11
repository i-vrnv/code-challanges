package leetcode.Problem_53_Maximum_Subarray;

/**
 * Runtime: 1 ms, faster than 73.49% of Java online submissions for Maximum Subarray.
 * Memory Usage: 40 MB, less than 19.24% of Java online submissions for Maximum Subarray.
 */
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}