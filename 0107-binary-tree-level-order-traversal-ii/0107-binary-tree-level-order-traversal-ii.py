from collections import deque
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrderBottom(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root: return []
        que = deque([root])
        res = deque([])
        while que:
            l = []
            for _ in range(len(que)):
                x = que.popleft()
                if x.left:
                    que.append(x.left)
                if x.right:
                    que.append(x.right)
                l.append(x.val)
            if l : res.appendleft(l)
        return list(res)

