class Solution:
    def minFlips(self, s: str) -> int:
        x = s.count('0')
        y = s.count('1')
        
        if y==0 or x == 0:
            return 0
        
        if s[0]=='1' and s[-1] == '1':
            return min(x, y -2)

        return min(y-1, x)