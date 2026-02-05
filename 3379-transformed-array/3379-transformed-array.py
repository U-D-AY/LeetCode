class Solution:
    def constructTransformedArray(self, nums: List[int]) -> List[int]:
        le = len(nums)  
        
        return [nums[(i + x)%le] for i, x in enumerate(nums)]