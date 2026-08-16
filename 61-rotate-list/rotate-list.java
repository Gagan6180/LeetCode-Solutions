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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        // Find the length and the tail of the list
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        
        // Optimize k if it is larger than the list length
        k = k % len;
        if (k == 0) {
            return head;
        }
        
        // Make the list circular
        tail.next = head;
        
        // Find the new tail: (len - k - 1) steps from the head
        ListNode newTail = head;
        for (int i = 0; i < len - k - 1; i++) {
            newTail = newTail.next;
        }
        
        // The new head is next to the new tail
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
}