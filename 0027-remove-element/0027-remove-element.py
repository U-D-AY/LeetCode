class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        l = len(nums)

        if l < 1: return 0

        p = 0
        for i in range(len(nums)):
            if nums[i] != val:
                nums[p] = nums[i]
                p += 1

        return p
