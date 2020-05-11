package leetcode.Problem_11_Container_With_Most_Water;

/**
 * A brute force solution.
 * Runtime: 373 ms, faster than 10.42% of Java online submissions for Container With Most Water.
 * Memory Usage: 39.7 MB, less than 95.51% of Java online submissions for Container With Most Water.
 */
class Solution {
    public int maxArea(int[] height) {
        int maxS = 0;
        for (int i = 0; i < height.length - 1; i++){
            for (int j = height.length - 1; j > i; --j) {
                int s = (j - i) * Math.min(height[i], height[j]);
                maxS = Math.max(s, maxS);
            }
        }
        return maxS;
    }
}