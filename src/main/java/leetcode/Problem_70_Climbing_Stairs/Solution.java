package leetcode.Problem_70_Climbing_Stairs;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
 * Memory Usage: 36 MB, less than 5.26% of Java online submissions for Climbing Stairs.
 */
class Solution {

    public int climbStairsMemo(int n) {
        if (n < 2) return 1;
        int[] memo = new int[n];
        memo[0] = 1;
        memo[1] = 2;

        for (int i = 2; i < n; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n-1];
    }

    public int climbStairsBottomUp(int n) {
        var s1 = 1;
        var s2 = 1;

        for (int i = 0; i < n - 1; i++) {
            var temp = s1;
            s1 = s1 + s2;
            s2 = temp;
        }

        return s1;
    }
}