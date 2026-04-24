from collections import Counter
class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        d = Counter(moves)
        x = 'L' if d['L']>d['R'] else 'R'

        n = moves.replace('_', x)

        s = 0
        for i in n:
            if i == 'L':
                s -= 1
            else:
                s += 1
        
        return abs(s)
        