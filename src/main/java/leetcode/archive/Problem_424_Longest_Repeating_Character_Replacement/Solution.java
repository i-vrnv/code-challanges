package leetcode.archive.Problem_424_Longest_Repeating_Character_Replacement;

/**
 * Runtime: 4 ms, faster than 92.65% of Java online submissions for Longest Repeating Character Replacement.
 * Memory Usage: 39.2 MB, less than 78.71% of Java online submissions for Longest Repeating Character Replacement.
 */
class Solution {
    public int characterReplacement(String s, int k) {

        int[] letters = new int[26];

        int maxCount = 0;
        int maxLength = 0;
        int startIndex = 0;

        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            maxCount = Math.max(maxCount, ++letters[s.charAt(endIndex) - 'A']);

            while(endIndex - startIndex - maxCount + 1 > k) {
                letters[s.charAt(startIndex) - 'A']--;
                startIndex++;
            }

            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
        }

        return maxLength;
    }
}