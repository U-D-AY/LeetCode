class Solution:
    def earliestFinishTime(self, landStartTime: List[int], landDuration: List[int], waterStartTime: List[int], waterDuration: List[int]) -> int:
        min1 = min(x+y for x, y in zip(landStartTime, landDuration))
        r1 = float('inf')
        for i,j in zip(waterStartTime, waterDuration):
            f = max(min1, i) + j
            r1 = min(r1, f)
        
        min2 = min(x+y for x, y in zip(waterStartTime, waterDuration))
        r2 = float('inf')
        for i, j in zip(landStartTime, landDuration):
            f = max(min2, i) + j
            r2 = min(r2, f)
        
        return min(r1, r2)