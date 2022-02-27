package leetcode.archive.Problem_28_Implement_strStr;

class Solution {
    public int strStr(String haystack, String needle) {
        int haystackSize = haystack.length();
        int needleSize = needle.length();

        if (needleSize > haystackSize) return -1;
        if ("".equals(needle)) return 0;

        char firstLetter = needle.charAt(0);
        for (int i = 0; i <= haystackSize - needleSize; i++) {
            if (haystack.charAt(i) == firstLetter) {
                String hsSubstring = haystack.substring(i, i + needleSize);
                if (hsSubstring.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}

