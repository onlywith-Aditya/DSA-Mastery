class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // 1-st way-> O(m x n) | O(1)
                // int n  = matrix.length;
                // int m  = matrix[0].length;
                // for(int i = 0;i<n;i++){
                //     for(int  j = 0;j<m;j++){
                //         if(matrix[i][j] == target) return true;
                //     }
                // }
                // return false;

        // 2nd Way

         int m = matrix.length;
        int n = matrix[0].length;
        
        // Step 1: Find the correct row
        int row = -1;
        for (int i = 0; i < m; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][n - 1]) {
                row = i;
                break;
            }
        }
        
        // If no row found, target doesn't exist
        if (row == -1) return false;
        
        // Step 2: Binary search in the row
        int left = 0;
        int right = n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;



    }
}