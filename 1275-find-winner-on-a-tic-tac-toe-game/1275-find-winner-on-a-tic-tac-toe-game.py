class Solution:
    def tictactoe(self, moves: list[list[int]]) -> str:
        # Track scores for 3 rows, 3 columns, and 2 diagonals
        rows = [0] * 3
        cols = [0] * 3
        diag = 0
        anti_diag = 0
        
        # Player A uses 1, Player B uses -1
        for index, (r, c) in enumerate(moves):
            value = 1 if index % 2 == 0 else -1
            
            # Update position scores
            rows[r] += value
            cols[c] += value
            if r == c:
                diag += value
            if r + c == 2:
                anti_diag += value
                
            # Check if current player reached 3 in a row
            if abs(rows[r]) == 3 or abs(cols[c]) == 3 or abs(diag) == 3 or abs(anti_diag) == 3:
                return "A" if value == 1 else "B"
                
        # Game over conditions
        return "Draw" if len(moves) == 9 else "Pending"
