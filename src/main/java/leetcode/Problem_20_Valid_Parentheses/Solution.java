package leetcode.Problem_20_Valid_Parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> s1 = new ArrayDeque<>();

        char[] chars = s.toCharArray();
        for (char c : chars) {
            s1.add(c);
        }

        Deque<Character> s2 = new ArrayDeque<>();

        while (!s1.isEmpty()) {

            Character s1elem = s1.pop();

            if (!s2.isEmpty()) {
                Character s2elem = s2.peek();

                if (isOpposite(s2elem, s1elem)) {
                    s2.pop();
                } else {
                    s2.push(s1elem);
                }
            } else {
                s2.push(s1elem);
            }
        }

        return s2.isEmpty();
    }

    private boolean isOpposite(Character s1, Character s2) {
        if ('(' == s1 && ')' == s2) {
            return true;
        }
        if ('{' == s1 && '}' == s2) {
            return true;
        }
        if ('[' == s1 && ']' == s2) {
            return true;
        }
        return false;
    }
}