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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode>str = new Stack<>();
        ListNode temp = head;

        while(temp != null){
            str.push(temp);
            temp = temp.next;
        }
        //create new list
        ListNode newHead = str.pop();
        int max = newHead.val;
        while(!str.isEmpty()){
            ListNode node = str.pop();

            if(node.val < max){
                continue;
            }else{
                //insert at head
                node.next = newHead;
                newHead = node;
                max = node.val;
            }
        }
        return newHead;
    }
}