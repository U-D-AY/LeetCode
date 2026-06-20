class Solution:
    def findTheArrayConcVal(self, nums: List[int]) -> int:
        c = 0
        i = 0
        j = len(nums) - 1
        while i<=j:
            if i!=j:
                c += int(str(nums[i]) + str(nums[j]))
            else:
                c+=nums[i]
            i+=1
            j-=1

        return c
