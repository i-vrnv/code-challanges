package leetcode.Problem_206_Reverse_Linked_List;

import leetcode.common.ListNode;

/**
 * Iterative solution
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
 * Memory Usage: 39 MB, less than 5.04% of Java online submissions for Reverse Linked List.
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}