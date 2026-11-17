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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode pointer = head;
        
        while (pointer != null) {
            if (visited.contains(pointer)) {
                return true;
            }
            visited.add(pointer);
            pointer = pointer.next;
        }
        return false;
    }
}
