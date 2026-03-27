class Solution:
    def areSimilar(self, mat: List[List[int]], k: int) -> bool:
        k = k % len(mat[0])
        s_m = [
            (row[k:]+row[:k]) if i%2 == 0 
            else (row[-k:]+row[:-k])
            for i, row in enumerate(mat)
        ]
        return mat == s_m