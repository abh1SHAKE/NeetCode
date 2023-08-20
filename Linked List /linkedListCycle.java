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
        // Initialize 'slow' and 'fast' pointers, 
        // (fast moving as twice as fast as slow). 
        ListNode slow=head;
        ListNode fast=head;

        /* Traversing the LinkedList */
        while(slow!=null && fast!=null && fast.next!=null){
            // 'slow' moving one step at a time.
            // 'fast' moving two steps at a time.
            slow=slow.next;
            fast=fast.next.next;

            // If 'slow' and 'fast' pointers meet at some
            // point, a cycle/loop exists in the Linked List.
            if(slow==fast){
                return true;
            }
        }

        return false;
    }
}
