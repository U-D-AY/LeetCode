class Solution:
    def constructTransformedArray(self, nums: List[int]) -> List[int]:
        le = len(nums)  
        result = [0] * le

        for i, j in enumerate(nums):
            if j > 0 or j < 0:
                result[i] = nums[(i + j) % le]
            else:
                result[i] = nums[i]

        return result 