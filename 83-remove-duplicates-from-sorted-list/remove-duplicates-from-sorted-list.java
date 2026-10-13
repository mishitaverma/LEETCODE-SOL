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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        
        // Traverse the list until we reach the end or the last node
        while (current != null && current.next != null) {
            // If the current node's value equals the next node's value, it's a duplicate
            if (current.val == current.next.val) {
                // Skip the next node by pointing to the one after it
                current.next = current.next.next;
            } else {
                // Otherwise, simply move forward to the next distinct node
                current = current.next;
            }
        }
        
        return head;
    }
}