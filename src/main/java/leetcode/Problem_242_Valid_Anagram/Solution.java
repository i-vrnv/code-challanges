package leetcode.Problem_242_Valid_Anagram;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        var arr = new int[26];

        for (int i = 0; i < s.length(); i++) {

            /*
            A char is actually just stored as a number (its code point value). We have syntax to represent
            characters like char c = 'A';, but it's equivalent to char c = 65; and 'A' == 65 is true.

            When we subtract 'a' from 'a' we get 0, because it's the same as 98 - 98.
            The same story with 'b'. When we subtract 'a' from 'b' we do 99(b char code) - 98(a char code)
             */
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int i: arr) {
            if (i != 0) return false;
        }

        return true;
    }
}