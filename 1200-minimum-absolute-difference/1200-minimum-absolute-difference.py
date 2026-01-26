class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        arr.sort()
        res = []
        m = float('inf')

        for i in range(1, len(arr)):
            x, y = arr[i-1], arr[i]
            z = y - x
            if z < m:
                res = [[x, y]]
                m = z
            elif z == m:
                res.append([x, y])
        
        return res