from collections import defaultdict, deque
class Solution:
    def assignEdgeWeights(self, edges: List[List[int]]) -> int:
        d = defaultdict(list)
        for i, j in edges:
            d[i].append(j)
            d[j].append(i)

        dq = deque([(1, 0)])
        v = {1}
        while dq:
            n, l = dq.popleft()
            for i in d[n]:
                if i not in v:
                    v.add(i)
                    dq.append((i, l + 1))
        
        return (2**(l-1))%(1000000000 + 7)

