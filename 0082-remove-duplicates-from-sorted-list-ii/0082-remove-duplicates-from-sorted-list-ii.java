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
        if(head == null || head.next == null) return head;

        ListNode left = head;
        ListNode right = head.next;
        ListNode temp=null;

        ListNode res = new ListNode(0, null);
        ListNode temp2 = res;
        int val = left.val;

        while(right!=null){
            val = left.val;
            if(val != right.val){
                temp2.next = new ListNode(val);
                temp2 = temp2.next;
                left = left.next;
                right = right.next; 
            }
            else{
                while(right != null && left.val == right.val){
                    left = left.next;
                    right = right.next;
                }
                if(right != null){
                    right = right.next;
                }
                left = left.next;
            }
        }
        if(left != null  && val != left.val)
            temp2.next = new ListNode(left.val);

        return res.next;

    }
}