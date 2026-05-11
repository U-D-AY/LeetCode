class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        return [int(j) for i in nums for j in str(i)]