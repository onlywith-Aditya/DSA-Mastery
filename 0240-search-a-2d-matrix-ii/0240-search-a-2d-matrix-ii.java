class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // Start from bottom left corner.

        int row = matrix.length - 1;  // Row
        int col = 0;   // Column

        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) col++;
            else row--;
        }
    return false;

    }
}