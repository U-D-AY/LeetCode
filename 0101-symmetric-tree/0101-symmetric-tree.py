from collections import deque
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if not root: return True

        deq = deque([(root.left, root.right)])
        while deq:
            x, y = deq.pop()

            if not x and not y: continue

            if not x or not y or x.val != y.val:
                return False
            
            deq.append((x.left, y.right))
            deq.append((x.right, y.left))
        
        return True