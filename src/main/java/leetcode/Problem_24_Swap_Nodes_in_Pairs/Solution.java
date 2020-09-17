package leetcode.Problem_24_Swap_Nodes_in_Pairs;

import leetcode.common.ListNode;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
 * Memory Usage: 37.2 MB, less than 60.38% of Java online submissions for Swap Nodes in Pairs.
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(head.next.next);
        next.next = head;
        return next;
    }
}