package leetcode.Problem_242_Valid_Anagram;

/**
 * Runtime: 3 ms, faster than 83.22% of Java online submissions for Valid Anagram.
 * Memory Usage: 39.6 MB, less than 76.56% of Java online submissions for Valid Anagram.
 */
class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] a = new int[26];

        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
            a[t.charAt(i) - 'a']--;
        }

        for (int i : a) {
            if ( i != 0 ) return false;
        }

        return true;
    }
}