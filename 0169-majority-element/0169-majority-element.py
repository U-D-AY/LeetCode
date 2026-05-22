class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        x = 0
        c = 0

        for i in nums:
            if c==0:
                x = i
            c += 1 if x==i else -1

        return x