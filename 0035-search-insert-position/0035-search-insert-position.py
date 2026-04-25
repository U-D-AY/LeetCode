class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        n = len(nums)
        l = 0
        h = n - 1

        while l<=h:
            mid = (l + h) // 2
            x = nums[mid]

            if target == x:
                return mid
            elif target<x:
                h = mid - 1
            else:
                l = mid + 1

        
        return l
        
            


