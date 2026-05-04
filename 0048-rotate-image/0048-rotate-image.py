class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)
        m = []
        for i in range(n):
            m.append([matrix[j][i] for j in range(n-1, -1, -1)])
        matrix[:] = m