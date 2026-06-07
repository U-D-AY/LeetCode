# Definition for a binary tree node.
from collections import defaultdict, deque
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def createBinaryTree(self, descriptions: List[List[int]]) -> Optional[TreeNode]:
        d = defaultdict(list)
        v = set()
        for i in descriptions:
            d[i[0]].append((i[1],i[-1]))
            v.add(i[1])

        val = next(iter(d.keys() - v))
        root = TreeNode(val)

        deq = deque([root])
        while deq:
            x = deq.pop()
            for i, j in d[x.val]:
                y = TreeNode(i)
                if j == 1:
                    x.left = y
                else:
                    x.right = y
                deq.append(y)
        
        return root
