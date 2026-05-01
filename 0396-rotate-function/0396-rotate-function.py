class Solution:
    def maxRotateFunction(self, nums: List[int]) -> int:
        n = len(nums)
        if n <= 1: return 0

        s = sum(nums)
        m = 0
        for i, j in enumerate(nums):
            m += i*j
        x = m
        for i in range(1, n):
            x = x + s - n*nums[-i]
            m = max(m, x)
        
        return m
        