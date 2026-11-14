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
    public ListNode ReverseLinkedList(ListNode head) {
        // Recursive Code 
        if(head==null||head.next==null) return head;
        ListNode NewHead = ReverseLinkedList(head.next);
        ListNode Front = head.next;
        Front.next=head;
        head.next=null;
        return NewHead;
        }

    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        ListNode Slow= head;
        ListNode Fast = head;
        while(Fast.next!=null && Fast.next.next!=null){
            Slow= Slow.next;
            Fast = Fast.next.next;
        }
        ListNode newHead= ReverseLinkedList(Slow.next);
        ListNode First = head;
        ListNode Second = newHead;
        while(Second!=null){
            if(First.val!=Second.val){
                ReverseLinkedList(newHead);
                return false;
            }
            First=First.next;
            Second=Second.next;
        }
        ReverseLinkedList(newHead);
        return true;
    }
}