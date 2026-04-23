from collections import defaultdict
class Solution:
    def distance(self, nums: List[int]) -> List[int]:
        d = defaultdict(list)
        for i, j in enumerate(nums):
            d[j].append(i)
        
        res = [0]*len(nums)
        for ind in d.values():
            n = len(ind)

            if n<=1:
                continue

            t = sum(ind)
            ls = 0
            for k, l in enumerate(ind):
                
                ld = l*k - ls
                rs = t - l - ls
                ri = n - k - 1
                rd = rs - ri*l

                res[l] = ld + rd

                ls += l
        
        return res



