package leetcode.Problem_205_Isomorphic_Strings;

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        var map = new HashMap<Character,Character>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = t.charAt(i);
            char c2 = s.charAt(i);

            if (map.containsKey(c1)) {
                if (c2 != map.get(c1)) {
                    return false;
                }
            } else {
                if (map.containsValue(c2)) {
                    return false;
                }
                map.put(c1,c2);
            }
        }

        return true;
    }

}