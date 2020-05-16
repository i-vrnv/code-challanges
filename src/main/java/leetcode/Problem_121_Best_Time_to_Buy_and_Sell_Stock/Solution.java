package leetcode.Problem_121_Best_Time_to_Buy_and_Sell_Stock;

/**
 * Runtime: 247 ms, faster than 13.06% of Java online submissions for Best Time to Buy and Sell Stock.
 * Memory Usage: 39.5 MB, less than 20.35% of Java online submissions for Best Time to Buy and Sell Stock.
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            for (int j = i; j >= 0; --j) {
                if (prices[i] > prices[j]) {
                    int profit = prices[i] - prices[j];
                    if (profit > maxProfit) {
                        maxProfit = profit;
                    }
                }
            }
        }
        return maxProfit;
    }
}