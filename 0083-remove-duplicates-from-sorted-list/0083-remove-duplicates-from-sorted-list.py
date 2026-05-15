# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current = head
        
        # Traverse the list until the end
        while current and current.next:
            if current.val == current.next.val:
                # Duplicate found: bypass the next node
                current.next = current.next.next
            else:
                # No duplicate: advance the pointer
                current = current.next
                
        return head