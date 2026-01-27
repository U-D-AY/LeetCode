from collections import Counter
class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        c = set(Counter(nums))
        return list(set(range(1, len(nums) + 1)) - c)
