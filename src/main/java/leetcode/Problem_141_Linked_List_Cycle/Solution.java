package leetcode.Problem_141_Linked_List_Cycle;

import leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Runtime: 5 ms, faster than 19.79% of Java online submissions for Linked List Cycle.
 * Memory Usage: 40.7 MB, less than 5.71% of Java online submissions for Linked List Cycle.
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> uniqueNodes = new HashSet<>();

        while (head != null) {
            if (uniqueNodes.contains(head)) {
                return true;
            } else {
                uniqueNodes.add(head);
                head = head.next;
            }
        }
        return false;
    }
}