class Solution:
    def containsCycle(self, grid: List[List[str]]) -> bool:
        # row and col size
        rows,  cols = len(grid), len(grid[0])

        # initializing parents and rank lists for union find
        parent = list(range(rows * cols))
        rank = [0] * (rows * cols)

        def find(idx):
            # if idx parent is itself return idx
            if parent[idx] == idx:
                return idx
            # path compression 
            parent[idx] = find(parent[idx])
            return parent[idx]
        
        def union(x, y):
            # finding parents of x & y
            rx = find(x)
            ry = find(y)

            if rx != ry:
                if rank[rx] > rank[ry]:
                    parent[ry] = rx
                elif rank[ry] > rank[rx]:
                    parent[rx] = ry
                else:
                    parent[ry] = rx
                    rank[rx] += 1
                return True
            return False
        
        for r in range(rows):
            for c in range(cols):
                # checking right and down only for each cell
                for nr, nc in [(r, c + 1), (r + 1, c )]:
                    if nr < rows and nc < cols and grid[r][c] == grid[nr][nc]:
                        # Compute 1D indexes 
                        id1 = r * cols + c
                        id2 = nr * cols + nc
                        # only happen if its has a circle
                        if not union(id1, id2):
                            return True
                        

        
        return False
                        
