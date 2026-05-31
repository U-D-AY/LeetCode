# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        sol = []
        def do(root):
            if root:
                do(root.left)
                do(root.right)
                sol.append(root.val)
        do(root)

        return sol
