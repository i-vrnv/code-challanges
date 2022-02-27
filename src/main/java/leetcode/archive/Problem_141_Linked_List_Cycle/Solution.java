package leetcode.archive.Problem_141_Linked_List_Cycle;

import leetcode.common.ListNode;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
 * Memory Usage: 39.8 MB, less than 5.71% of Java online submissions for Linked List Cycle.
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null){
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}