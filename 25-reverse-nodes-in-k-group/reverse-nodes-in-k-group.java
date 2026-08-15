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
        
        if(head == null || k == 1){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode gpPre = dummy;

        while(true){

            ListNode kth = findKth(gpPre,k);
            if(kth == null){
                break;
            }

            ListNode gpNext = kth.next;

            ListNode curr = gpPre.next;
            ListNode prev = kth.next;

            while(curr != gpNext){
                ListNode nex = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nex;
            }

            ListNode temp = gpPre.next;
            gpPre.next = kth;
            gpPre = temp;
        }
        return dummy.next;
    }
    private ListNode findKth(ListNode curr, int k){

        while(curr != null && k > 0){
            curr = curr.next;
            k--;
        }
        return curr;
    }
}