class Solution:
    def getMinDistance(self, nums: List[int], target: int, start: int) -> int:
        le = len(nums)
        mini = float('inf')

        for i in range(start, le):
            if nums[i]==target:
                mini = min(mini, abs(i - start))
                break
        
        for i in range(start, -1, -1):
            if nums[i] == target:
                mini = min(mini, abs(start - i))
                break
        
        return mini