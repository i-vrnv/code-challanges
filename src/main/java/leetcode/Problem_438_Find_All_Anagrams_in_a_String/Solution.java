package leetcode.Problem_438_Find_All_Anagrams_in_a_String;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        var result = new LinkedList<Integer>();

        if (s == null || s.length() == 0) return result;

        var chars = new int[26];

        for (char c : p.toCharArray()) {
            chars[c - 'a']++;
        }

        var left = 0;
        var right = 0;
        var count = p.length();

        while (right < s.length()) {
            if (chars[s.charAt(right) - 'a'] >= 1) {
                count--;
            }
            chars[s.charAt(right) - 'a']--;
            right++;

            if (count == 0) result.add(left);

            if (right - left == p.length()) {
                if (chars[s.charAt(left) - 'a'] >= 0) {
                    count++;
                }
                chars[s.charAt(left) - 'a']++;
                left++;
            }
        }

        return result;
    }
}
