package leetcode.archive.Problem_322_Coin_Change;

import java.util.Arrays;

/**
 * Runtime: 11 ms, faster than 87.04% of Java online submissions for Coin Change.
 * Memory Usage: 38.7 MB, less than 5.33% of Java online submissions for Coin Change.
 */
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] arr = new int[amount + 1]; // Can I use 'Integer.MAX' instead of 'amount + 1' here?
        Arrays.fill(arr, amount + 1);
        arr[0] = 0;
        for (int i = 0; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    arr[i] = Math.min(arr[i], 1 + arr[i - coin]);
                }
            }
        }
        return arr[amount] > amount ? -1 : arr[amount] ;
    }
}