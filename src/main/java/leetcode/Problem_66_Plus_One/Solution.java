package leetcode.Problem_66_Plus_One;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
 * Memory Usage: 37.9 MB, less than 80.12% of Java online submissions for Plus One.
 */
class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            int curr = digits[i];

            if (curr == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }

        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }
}