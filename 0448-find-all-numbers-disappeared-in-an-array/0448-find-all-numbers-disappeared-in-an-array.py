class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        c = set(nums)
        return list(set(range(1, len(nums) + 1)) - c)
