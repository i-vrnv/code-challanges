package leetcode.Problem_14_Longest_Common_Prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        if (strs.length == 0) return prefix.toString();
        int i = 0;
        while (true) {
            try {
                char letter = strs[0].charAt(i);
                for (String s : strs) {
                    if (!s.startsWith(prefix.toString() + letter)) return prefix.toString();
                }
                prefix.append(letter);
                i++;
            } catch (Exception e) {
                return prefix.toString();
            }
        }
    }
}