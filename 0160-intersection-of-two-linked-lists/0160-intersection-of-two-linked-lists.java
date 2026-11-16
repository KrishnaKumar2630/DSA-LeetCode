public class Solution {
    int Length(ListNode head) {
        ListNode temp = head;
        int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        return n;
    }

    ListNode CollisionPoint(ListNode t1, ListNode t2, int d) {
        while (d > 0) {          // was d >= 0
            d--;
            t2 = t2.next;
        }
        while (t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;               // null if no intersection
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int L1 = Length(headA);
        int L2 = Length(headB);
        if (L1 < L2) {
            return CollisionPoint(headA, headB, L2 - L1);
        } else {
            return CollisionPoint(headB, headA, L1 - L2);
        }
    }
}