from collections import Counter

class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        counts = Counter(nums)
        lookup = {}
        c_s = 0

        for i in sorted(counts):
            lookup[i] = c_s
            c_s += counts[i]

        return [lookup[i] for i in nums] 