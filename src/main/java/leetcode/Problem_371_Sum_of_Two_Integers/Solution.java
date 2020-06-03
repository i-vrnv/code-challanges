package leetcode.Problem_371_Sum_of_Two_Integers;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Two Integers.
 * Memory Usage: 35.9 MB, less than 6.67% of Java online submissions for Sum of Two Integers.
 */
class Solution {
    public int getSum(int a, int b) {
        if (b == 0) return a;
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sum, carry);
    }
}