class Solution:
    def check(self, nums: List[int]) -> bool:
        d = 0
        n = len(nums)
        for i in range(n):
            if nums[i]>nums[(i+1)%n]:
                d+=1
        
        return True if d<=1 else False