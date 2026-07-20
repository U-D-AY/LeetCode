class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int totalElements = rows * cols;
        
        // Optimize k: shifting totalElements times brings us back to the start
        k = k % totalElements;
        
        // Initialize the output 2D list with placeholder values
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(0);
            }
            result.add(row);
        }
        
        // Place each element directly into its final shifted position
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                // 1. Convert current 2D position to 1D index
                int current1DIndex = r * cols + c;
                
                // 2. Find the new 1D index after shifting k times
                int new1DIndex = (current1DIndex + k) % totalElements;
                
                // 3. Convert the new 1D index back to 2D coordinates
                int newRow = new1DIndex / cols;
                int newCol = new1DIndex % cols;
                
                // 4. Put the value in the final result grid
                result.get(newRow).set(newCol, grid[r][c]);
            }
        }
        
        return result;
    }
}