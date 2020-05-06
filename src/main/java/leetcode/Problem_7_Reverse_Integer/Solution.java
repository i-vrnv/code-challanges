package leetcode.Problem_7_Reverse_Integer;

class Solution {
    public int reverse(int x) {

        String str = String.valueOf(x);
        boolean isNegative = str.startsWith("-");

        String reversed = "";
        if (isNegative) {
            reversed = new StringBuilder(str.substring(1)).reverse().toString();
            reversed = "-" + reversed;
        } else {
            reversed = new StringBuilder(str).reverse().toString();
        }

        int result = 0;
        try {
            result = Integer.parseInt(reversed);
            return result;
        } catch (NumberFormatException e) {
            return result;
        }
    }
}