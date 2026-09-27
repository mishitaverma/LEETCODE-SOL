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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to serve as the starting point of our result list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        // Loop runs as long as there are nodes to process or a leftover carry
        while (l1 != null || l2 != null || carry != 0) {
            // Get the values from the current nodes, default to 0 if the list ended
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            
            // Calculate total sum and the new carry
            int sum = val1 + val2 + carry;
            carry = sum / 10; // Get the tens place (e.g., 15 / 10 = 1)
            int digit = sum % 10; // Get the ones place (e.g., 15 % 10 = 5)
            
            // Create a new node with the digit and attach it to our result list
            current.next = new ListNode(digit);
            current = current.next;
            
            // Move to the next nodes in the input lists
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        // Return the actual result, skipping the initial dummy node
        return dummyHead.next;
    }
}