class Solution:
    def createGrid(self, m: int, n: int) -> list[str]:
        l = ['.' * n]
        for i in range(m - 1):
            l.append("#"*(n-1) + '.')

        return l