from collections import Counter
class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        l = moves.count('L')
        r = moves.count('R')

        return abs(l - r) + len(moves) - l - r

        