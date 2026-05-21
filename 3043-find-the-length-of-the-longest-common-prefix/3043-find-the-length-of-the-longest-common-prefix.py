class Solution:
    def longestCommonPrefix(self, arr1: List[int], arr2: List[int]) -> int:
        pre = set()
        for i in arr1:
            while i>0:
                pre.add(i)
                i//=10
        
        m = 0
        for i in arr2:
            while i>0:
                if i in pre:
                    m = max(m, i)
                    break
                i//=10
        
        return len(str(m)) if m>0 else 0