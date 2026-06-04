class Solution:
    def totalWaviness(self, num1: int, num2: int) -> int:
        w = 0
        for i in range(num1, num2 + 1):
            if i > 100:
                while i>100:
                    r = i%10
                    i = i//10
                    m = i%10
                    l = (i//10)%10
                    if (r>m and l>m) or (r<m and l<m):
                        w += 1
        
        return w