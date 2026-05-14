class Solution:
    def isGood(self, nums: List[int]) -> bool:
        nums.sort()
        n = len(nums)
        for i, j in zip(nums, range(1, n)):
            if i != j:
                return False
        if nums[-1] == n-1:
            return True
        else:
            return False