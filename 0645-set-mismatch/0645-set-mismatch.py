class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        n = len(nums)
        s1 = sum(nums)
        s2 = sum(set(nums))
        d = s1 - s2
        m = ( n * (n + 1) // 2 ) - s2

        return [d, m]