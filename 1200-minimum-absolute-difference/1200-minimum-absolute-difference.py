from collections import defaultdict

class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        arr.sort()
        
        m = min(arr[i] - arr[i-1] for i in range(1, len(arr)))

        return [[arr[i-1], arr[i]] for i in range(1, len(arr)) if arr[i] - arr[i-1] == m]