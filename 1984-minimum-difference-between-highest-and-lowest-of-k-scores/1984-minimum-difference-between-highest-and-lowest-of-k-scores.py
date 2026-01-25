class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        if len(nums) == 1:
            return 0
        
        nums.sort()

        min_diff = float('inf')

        for i in range(len(nums) - k + 1):
            min_diff = min(min_diff, nums[k + i - 1] - nums[i])
        
        return min_diff