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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null||left==right) return head;

        ListNode leftnode;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        for(int i=0;i<left-1;i++){
            temp = temp.next;
        }

        leftnode = temp.next.next;
        ListNode cur = temp.next;
        ListNode nex = leftnode;

        for(int i = left; leftnode!=null && i<right; i++){
            nex = nex.next;
            leftnode.next = cur;

            cur = leftnode;
            leftnode = nex;
        }

        temp.next.next = leftnode;
        temp.next = cur;

        return dummy.next;
    }
}