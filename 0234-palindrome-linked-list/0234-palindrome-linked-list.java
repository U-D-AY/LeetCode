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
    private ListNode Lis;
    public boolean isPalindrome(ListNode head) {
        Lis = head;
        return campare(head);
    }
    public boolean campare(ListNode temp){
        if(temp == null) return true;

        boolean res = campare(temp.next);

        if(!res) return false;

        boolean mat = temp.val == Lis.val;

        Lis = Lis.next;

        return mat;
    }
    
}