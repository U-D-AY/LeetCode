class Solution:
    def hasValidPath(self, grid: List[List[int]]) -> bool:
        rows = len(grid)
        cols = len(grid[0])

        parent = list(range(rows*cols))

        def find(x):
            while parent[x] != x:
                parent[x] = parent[parent[x]]
                x = parent[x]
            return x

        def union(y, z):
            ry = find(y)
            rz = find(z)
            if ry==rz:
                return 
            
            parent[rz] = ry
            return
        
        for r in range(rows):
            for c in range(cols):
                k = grid[r][c]
                id1 = r * cols + c
                if k == 1:
                    _=-1
                    for nr,nc in [(r, c-1), (r, c+1)]:
                        _+=1
                        if nc<0 or nc>=cols:
                            continue
                        
                        l = grid[nr][nc]
                        if (_==0 and l in {1,4,6}) or (_==1 and l in {1,3,5}):
                            id2 = nr * cols + nc
                            union(id1, id2)

                elif k == 2:
                    _=-1
                    for nr,nc in [(r-1, c), (r+1, c)]:
                        _+=1
                        if nr<0 or nr>=rows:
                            continue

                        l = grid[nr][nc]
                        if (_==0 and l in {3,2,4}) or (_==1 and l in {5,2,6}):
                            id2 = nr * cols + nc
                            union(id1, id2)

                elif k == 3:
                    _=-1
                    for nr,nc in [(r, c-1), (r+1, c)]:
                        _+=1
                        if nc<0 or nr>=rows:
                            continue
                        
                        l = grid[nr][nc]
                        if (_==0 and l in {1,4,6}) or (_==1 and l in {2,5,6}):
                            id2 = nr * cols + nc
                            union(id1, id2)

                elif k == 4:
                    _=-1
                    for nr,nc in [(r, c+1), (r+1, c)]:
                        _+=1
                        if nr>=rows or nc>=cols:
                            continue

                        l = grid[nr][nc]
                        if (_==0 and l in {1,3,5}) or (_==1 and l in {2,5,6}):
                            id2 = nr * cols + nc
                            union(id1, id2)

                elif k == 5:
                    _=-1
                    for nr,nc in [(r, c-1), (r-1, c)]:
                        _+=1
                        if nc<0 or nr<0:
                            continue

                        l = grid[nr][nc]
                        if (_==0 and l in {4,6,1}) or (_==1 and l in {3,4,2}):
                            id2 = nr * cols + nc
                            union(id1, id2)

                elif k == 6:
                    _=-1
                    for nr,nc in [(r-1, c), (r, c+1)]:
                        _+=1
                        if nr<0 or nc>=cols:
                            continue

                        l = grid[nr][nc]
                        if (_==0 and l in {4,3,2}) or (_==1 and l in {3,5,1}):
                            id2 = nr * cols + nc
                            union(id1, id2)
                
        return find(0) == find(rows*cols-1)