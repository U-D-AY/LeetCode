class Solution:
    def rotateTheBox(self, boxGrid: List[List[str]]) -> List[List[str]]:
        n = len(boxGrid)
        m = len(boxGrid[0])
        
        for i in boxGrid:
            r = m - 1
            for j in range(m - 1, -1, -1):
                if i[j] == '#':
                    i[j], i[r] = i[r], i[j]
                    r -= 1
                elif i[j] == '*':
                    r = j - 1
        
        res = [[" " for _ in range(n)] for _ in range(m)]
        
        for r in range(n):
            for c in range(m):
                res[c][n - r -1] = boxGrid[r][c]
        
        return res