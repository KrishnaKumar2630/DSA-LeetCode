/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head){
        // Optimal Approach Using Slow and Fast Pointers
        ListNode Slow= head, Fast = head;
        while(Fast!=null&&Fast.next!=null){
            Slow=Slow.next;
            Fast=Fast.next.next;
            if(Slow==Fast){
                return true;
            }
        }       return false;
        //BruteForce Approach
        // HashSet<ListNode> visited = new HashSet<>();
        // ListNode pointer = head;
        
        // while (pointer != null) {
        //     if (visited.contains(pointer)) {
        //         return true;
        //     }
        //     visited.add(pointer);
        //     pointer = pointer.next;
        // }
        // return false;
    }
}
