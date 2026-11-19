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
    public ListNode reverseList(ListNode head) {
        // Recursive Code 
        if(head==null||head.next==null) return head;
        ListNode NewHead = reverseList(head.next);
        ListNode Front = head.next;
        Front.next=head;
        head.next=null;
        return NewHead;
    }
    public ListNode FindkthNode(ListNode temp, int k) {
    k -= 1;                       // k-th node is k-1 steps away
    while (temp != null && k > 0) {
        k--;
        temp = temp.next;
    }
    return temp;
}

public ListNode reverseKGroup(ListNode head, int k) {
    ListNode temp = head;
    ListNode prev = null;
    while (temp != null) {
        ListNode kth = FindkthNode(temp, k);
        if (kth == null) {                  // fewer than k nodes left
            if (prev != null) prev.next = temp;
            break;
        }
        ListNode next = kth.next;
        kth.next = null;                    // cut the group
        reverseList(temp);                  // temp becomes the group's tail
        if (temp == head) head = kth;
        else prev.next = kth;               // link previous group to this one
        prev = temp;                        // tail of the reversed group
        temp = next;
    }
    return head;
}
    }
