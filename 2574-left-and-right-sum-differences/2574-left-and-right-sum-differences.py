class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        a = []
        l = 0
        r = sum(nums)
        for i in nums:
            r = r - i
            a.append(abs(l - r))
            l += i
        
        return a