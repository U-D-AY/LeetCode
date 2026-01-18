class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        o = m = 0
        for i in nums:
            o = o + 1 if i == 1 else 0
            m = max(m, o)

        return m
