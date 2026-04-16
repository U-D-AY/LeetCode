from collections import defaultdict
from bisect import bisect_left

class Solution:
    def solveQueries(self, nums: List[int], queries: List[int]) -> List[int]:
        n = len(nums)
        # 1. Pre-process: Group indices by value O(N)
        pos_map = defaultdict(list)
        for idx, val in enumerate(nums):
            pos_map[val].append(idx)
            
        memo = {}
        res = []
        
        for q_idx in queries:
            if q_idx in memo:
                res.append(memo[q_idx])
                continue
            
            target = nums[q_idx]
            indices = pos_map[target]
            
            # If the number only appears once, there is no other match
            if len(indices) == 1:
                ans = -1
            else:
                # 2. Binary search to find the position of q_idx in the list of indices O(log N)
                pos = bisect_left(indices, q_idx)
                
                # We only need to check the elements immediately before and after
                # Use modulo for easy circular logic
                left_idx = indices[(pos - 1) % len(indices)]
                right_idx = indices[(pos + 1) % len(indices)]
                
                # 3. Calculate circular distance for both neighbors
                d1 = abs(q_idx - left_idx)
                d2 = abs(q_idx - right_idx)
                
                ans = min(d1, n - d1, d2, n - d2)
            
            memo[q_idx] = ans
            res.append(ans)
            
        return res
        

       