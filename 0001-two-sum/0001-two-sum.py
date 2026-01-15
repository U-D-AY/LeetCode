class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hash_map=dict()
        for i,j in enumerate(nums):
            k:int=target-j
            if k in hash_map:
                return [hash_map[k],i]
            hash_map[j]=i
        return
            