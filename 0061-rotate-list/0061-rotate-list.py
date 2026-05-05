# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        temp = head
        c = 0
        while temp:
            c += 1
            temp = temp.next

        if c == 0: return head
        k = k%c
        if not k: return head

        temp = head
        for i in range(c - k):
            prev = temp
            temp = temp.next
        t = head
        head = temp
        prev.next = None

        for i in range(k-1):
            temp = temp.next
        
        temp.next = t

        return head
        
            