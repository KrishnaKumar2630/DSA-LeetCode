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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode Fast = head;
        for(int i=0;i<n;i++){
            Fast= Fast.next;
        }
        ListNode Slow= head;
        if(Fast==null) return head.next;
    while(Fast.next!=null){
        Slow= Slow.next;
        Fast= Fast.next;
    }
    Slow.next= Slow.next.next;
    return head;

    }
}