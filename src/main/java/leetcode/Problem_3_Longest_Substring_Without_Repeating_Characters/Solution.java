package leetcode.Problem_3_Longest_Substring_Without_Repeating_Characters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        Set<Character> chars = new HashSet<>(26);
        Map<Character, Integer> charPosition = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (chars.contains(currChar)) {
                if (maxCount < chars.size()) {
                    maxCount = chars.size();
                }
                chars.clear();
                i = charPosition.get(currChar);
            } else {
                chars.add(currChar);
                charPosition.put(currChar, i);
            }
        }
        if (maxCount < chars.size()) {
            maxCount = chars.size();
        }
        return maxCount;
    }
}