class Solution:
    def maxDistance(self, colors: List[int]) -> int:
        n = len(colors)
        d = 0

        for i in range(n):
            if colors[i]!=colors[0]:
                d = max(d, i)
            
            if colors[i]!=colors[n-1]:
                d = max(d, n -1 - i)
        
        return d

      
            