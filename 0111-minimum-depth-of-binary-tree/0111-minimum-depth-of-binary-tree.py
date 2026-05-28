from collections import deque
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        if not root: return 0
        que = deque([(root, 1)])
        while que:
            x, y = que.popleft()
            if not x.left and not x.right:
                return y
            if x.left:
                que.append((x.left, y+1))
            if x.right:
                que.append((x.right, y+1))
        return y

