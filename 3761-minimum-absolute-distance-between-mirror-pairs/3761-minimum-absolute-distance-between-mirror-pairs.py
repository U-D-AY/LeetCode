from math import inf
class Solution:
    def minMirrorPairDistance(self, nums: List[int]) -> int:
        
        pos = {}
        mi = inf

        for i, j in enumerate(nums):
            if j in pos:
                mi = min(mi, i - pos[j])
            pos[int(str(j)[::-1])] = i
        
        return -1 if mi == inf else mi