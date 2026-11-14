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



       // Iterativer Code 
        // ListNode prev = null;
        // ListNode curr = head;

        // while (curr != null) {
        //     ListNode nextNode = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = nextNode;
        // }

        // return prev;
    }
}
