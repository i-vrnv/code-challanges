package leetcode.Problem_160_Intersection_of_Two_Linked_Lists;

import leetcode.common.ListNode;

public class HashingBruteforceSolution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        var ptrA = headA;
        var ptrB = headB;

        while (ptrA != ptrB) {
            if (ptrA == null) {
                ptrA = headB;
            } else {
                ptrA = ptrA.next;
            }

            if (ptrB == null) {
                ptrB = headA;
            } else {
                ptrB  = ptrB.next;
            }
        }
        return ptrA;
    }
}