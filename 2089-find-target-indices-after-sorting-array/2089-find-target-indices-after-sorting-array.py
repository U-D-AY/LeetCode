class Solution:
    def targetIndices(self, nums: list[int], target: int) -> list[int]:
        less_than = sum(1 for x in nums if x < target)
        equal_to = sum(1 for x in nums if x == target)
        return list(range(less_than, less_than + equal_to))
