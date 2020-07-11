package leetcode.Problem_83_Remove_Duplicates_from_Sorted_List;

import leetcode.common.ListNode;

/**
 * Runtime: 1 ms, faster than 34.17% of Java online submissions for Remove Duplicates from Sorted List.
 * Memory Usage: 41.6 MB, less than 7.27% of Java online submissions for Remove Duplicates from Sorted List.
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode origin = head;

        while (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return origin;
    }
}