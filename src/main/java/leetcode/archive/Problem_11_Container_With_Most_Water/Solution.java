package leetcode.archive.Problem_11_Container_With_Most_Water;

/**
 * O(n) solution.
 * Runtime: 2 ms, faster than 94.94% of Java online submissions for Container With Most Water.
 * Memory Usage: 40.3 MB, less than 91.67% of Java online submissions for Container With Most Water.
 */
class Solution {
    public int maxArea(int[] height) {
        int maxS = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            int s = (j - i) * Math.min(height[i], height[j]);
            maxS = Math.max(s, maxS);
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxS;
    }
}