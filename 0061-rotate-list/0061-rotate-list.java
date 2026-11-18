/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode FindNextNode(ListNode temp, int x) {
        int count = 1;
        while (temp != null) {
            if (count == x) return temp;
            count++;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode rotateRight(ListNode head, int k) {
        // 1. Handle empty or single-node lists
        if (head == null || head.next == null) return head;

        int len = 1;
        ListNode Tail = head;
        while (Tail.next != null) {
            len++;
            Tail = Tail.next;
        }

        if (k % len == 0) return head;
        k = k % len;

        // Connect tail to head to form a circle
        Tail.next = head;

        // Find the new tail at position (len - k)
        ListNode newLastNode = FindNextNode(head, len - k);
        head = newLastNode.next;

        // 2. Break the cycle by setting .next to null
        newLastNode.next = null;

        return head;
    }
}
