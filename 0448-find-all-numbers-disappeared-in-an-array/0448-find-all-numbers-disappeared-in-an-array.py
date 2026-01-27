class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        for i in nums:
            idx = abs(i) - 1
            nums[idx] = -abs(nums[idx])
        return [x + 1 for x, y in enumerate(nums) if y > 0]
