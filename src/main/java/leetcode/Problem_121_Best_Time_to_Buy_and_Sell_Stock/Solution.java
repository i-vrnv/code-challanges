package leetcode.Problem_121_Best_Time_to_Buy_and_Sell_Stock;

/**
 * Runtime: 2 ms, faster than 86.96% of Java online submissions for Best Time to Buy and Sell Stock.
 * Memory Usage: 76.6 MB, less than 73.60% of Java online submissions for Best Time to Buy and Sell Stock.
 */
class Solution {
    public int maxProfit(int[] prices) {
        var minPrice = Integer.MAX_VALUE;
        var ifWeSoldToday = 0;
        var maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            ifWeSoldToday = price - minPrice;
            if (ifWeSoldToday > maxProfit) {
                maxProfit = ifWeSoldToday;
            }
        }
        return maxProfit;
    }
}