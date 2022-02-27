package leetcode.archive.Problem_76_Minimum_Window_Substring;


import java.util.HashMap;

/**
 * Not completed (hard)
 */
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> caseChars = createCaseCharsSet(t);
        HashMap<Character, Integer> windowsChars = new HashMap<>();

        String result = "";

        int l = 0;
        int r = 0;
        
        int totalCharsFrequencies = caseChars.size();
        int charFrequenciesInWindowThatMatch = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            windowsChars.put(c, windowsChars.getOrDefault(c, 0) + 1);


        }

        return result;
    }

    private HashMap<Character, Integer> createCaseCharsSet(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        return map;
    }
}