package leetcode.Problem_160_Intersection_of_Two_Linked_Lists;

import leetcode.common.ListNode;

import java.util.HashSet;

public class TwoPointersSolution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        var visited = new HashSet<ListNode>();

        var ptrA = headA;
        while(ptrA != null) {
            visited.add(ptrA);
            ptrA = ptrA.next;
        }

        var ptrB = headB;
        while(ptrB != null) {
            if (visited.contains(ptrB)) return ptrB;
            ptrB = ptrB.next;
        }

        return null;
    }
}