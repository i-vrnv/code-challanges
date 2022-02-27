package leetcode.archive.Problem_121_Best_Time_to_Buy_and_Sell_Stock;

/**
* Runtime: 1 ms, faster than 99.17% of Java online submissions for Best Time to Buy and Sell Stock.
* Memory Usage: 39.5 MB, less than 21.24% of Java online submissions for Best Time to Buy and Sell Stock.
 */
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int c: prices) {
            min = Math.min(c, min);
            max = Math.max(max, c - min);
        }
        return max;
    }
}