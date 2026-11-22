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
    public ListNode TortoiseHare(ListNode head){
        ListNode Slow= head;
        ListNode Fast= head.next;
        while(Fast!=null&&Fast.next!=null){
            Slow= Slow.next;
            Fast = Fast.next.next;
        }
        return Slow;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode Temp1 = list1;
        ListNode Temp2 = list2;
        ListNode MergedList = new ListNode();
        ListNode Pointer = MergedList;

        while (Temp1 != null && Temp2 != null) {
            if (Temp1.val < Temp2.val) {
                Pointer.next = Temp1;
                Temp1 = Temp1.next;
            } else {
                Pointer.next = Temp2;
                Temp2 = Temp2.next;
            }
            Pointer = Pointer.next;
        }

        if (Temp1 != null) {
            Pointer.next = Temp1;
        } else {
            Pointer.next = Temp2;
        }

        return MergedList.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode Middle = TortoiseHare(head);
        ListNode left= head;
        ListNode right= Middle.next;
        Middle.next=null;
        left = sortList(head);
        right = sortList(right);
        return mergeTwoLists(left,right);

    }
}