class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        l = len(nums)
        pre = [0]*( l+ 1)
        for i in range(l):
            pre[i+1] = pre[i]+nums[i]

        for i in range(1, l+1):
            if pre[i-1] == pre[-1] - pre[i]:
                return i-1
            
        return -1