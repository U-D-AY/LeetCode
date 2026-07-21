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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null )
            return head;

        ListNode left = head;
        ListNode right = head.next;
        ListNode temp = null;

        head = right;
        left.next = right.next;
        right.next = left;

        right = right.next.next;

        while(right != null && right.next!=null){
            right = right.next;

            temp = left;
            left = left.next;
            left.next = right.next;
            temp.next = right;
            right.next = left;

            right = right.next.next;
        }

        return head;
    }
}