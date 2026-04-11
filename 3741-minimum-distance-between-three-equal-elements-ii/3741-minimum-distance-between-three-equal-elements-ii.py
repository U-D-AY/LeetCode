from collections import defaultdict
class Solution:
    def minimumDistance(self, nums: List[int]) -> int:
        s = defaultdict(list)
        for i, j in enumerate(nums):
            s[j].append(i)
        
        v = float('inf')
        for i in s.values():
            if len(i)<3:
                continue

            for j in range(0, len(i)-2):
                c = 2*(i[j+2] - i[j])
                if v>c:
                    v = c
        
        return int(v) if v != float('inf') else -1