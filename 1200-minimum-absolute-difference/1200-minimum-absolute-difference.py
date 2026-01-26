from collections import defaultdict

class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        arr.sort()
        look_up = defaultdict(list)
        m = float('inf')
        for i in range(1, len(arr)):
            x = arr[i] - arr[i - 1]
            if x <= m:
                look_up[x].append([arr[i - 1], arr[i]])
                m = x
        
        return look_up[m]