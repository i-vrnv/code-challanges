package leetcode.archive.Problem_23_Merge_k_Sorted_Lists;

import leetcode.common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Runtime: 15 ms, faster than 20.82% of Java online submissions for Merge k Sorted Lists.
 * Memory Usage: 45 MB, less than 20.22% of Java online submissions for Merge k Sorted Lists.
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.val));
        for (ListNode l : lists) {
            ListNode next = l;
            while (next != null) {
                pq.add(next);
                next = next.next;
            }
        }

        ListNode ptr = new ListNode(0);
        ListNode node = ptr;
        while (!pq.isEmpty()) {
            node.next = pq.poll();
            node = node.next;
        }
        node.next = null;
        return ptr.next;
    }
}