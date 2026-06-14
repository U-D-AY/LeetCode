# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        
        def reverse(x):
            p = None
            t = x
            while x:
                n = x.next
                x.next = p
                p = x
                x = n

            return p

        slow = head
        fast = head

        while fast:
            slow = slow.next
            fast = fast.next.next

        t = head
        t1 = reverse(slow)
        t2 = t1
        m = 0

        while t2:
            m = max(m, t.val + t2.val)
            t = t.next
            t2 = t2.next

        reverse(t1)

        return m
