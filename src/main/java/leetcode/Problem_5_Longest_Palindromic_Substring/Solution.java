package leetcode.Problem_5_Longest_Palindromic_Substring;

class Solution {
    /*
    Runtime: 648 ms, faster than 5.00% of Java online submissions for Longest Palindromic Substring.
    Memory Usage: 39.2 MB, less than 22.99% of Java online submissions for Longest Palindromic Substring.
     */
    public String longestPalindrome(String s) {

        String longest = "";

        for (int i = 0; i <= s.length() - 1; i++) {
            for (int j = s.length() - 1; j >= i; --j) {
                if (s.charAt(i) == s.charAt(j) && isPalindrome(s.substring(i, j+1))) {
                    String candidate = s.substring(i, j+1);
                    if (candidate.length() > longest.length()) {
                        if (s.length() - j < candidate.length()) return candidate;
                        longest = candidate;
                    }
                }
            }
        }
        return longest;
    }

    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}