class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        nums.sort(reverse=True)
        nums=sorted(nums,key=lambda item:nums.count(item))
        return nums