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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        for(int i=0; i<k; i++){
            if(current == null){
                return head;
            }
            current = current.next;
        }

        ListNode prev = null;
        ListNode nextNode = null;
        current = head;

        for(int i=0; i<k; i++){
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        if(nextNode != null){
            head.next = reverseKGroup(nextNode,k);
        }
        return prev;
    }
}