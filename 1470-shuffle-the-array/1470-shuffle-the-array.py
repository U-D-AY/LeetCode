class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        ans = []
        for i in zip(nums[:n], nums[n:]):
            ans.extend(i)
        return ans