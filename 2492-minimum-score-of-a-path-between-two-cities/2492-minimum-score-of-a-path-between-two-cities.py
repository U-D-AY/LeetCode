from collections import deque, defaultdict
class Solution:
    def minScore(self, n: int, roads: List[List[int]]) -> int:
        d = defaultdict(list)
        for i, j, k in roads:
            d[i].append((j, k))
            d[j].append((i, k))
            
        deq = deque([1])
        visited = set()
        m = float('inf')

        while deq:
            node = deq.pop()
            for n, dis in d[node]:
                m = min(dis, m)

                if n not in visited:
                    visited.add(n)
                    deq.append(n)
            
        
        return m
        