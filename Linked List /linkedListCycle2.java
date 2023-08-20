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
    public ListNode detectCycle(ListNode head) {
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

                // To find the Node where the Cycle begins, initialize 'slow'
                // to head and move both 'slow' and 'fast' pointers one increment
                // at a time, where they meet is the where the loop/cycle starts.
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }

                return slow;
            }
        }

        return null;
    }
}
