class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n-1][n-1];

        while(left<right){
            int mid = left + (right - left) / 2;

            if(countLessOrEqual(matrix,mid) >= k){
                right = mid;    // Answer is <= mid
            }
            else{
                left = mid + 1; // Answer is > mid
            }
        }
    
        return left;
    
    }

    private int countLessOrEqual(int[][] matrix, int target){
        
        int n  = matrix.length;
        int count = 0;
        int row = n-1; // Start from bottom left corner.
        int col = 0;

        while(row>=0 && col<n){
            if(matrix[row][col] <= target){
                // Count column has (row + 1) elements in <= target
                count += row + 1;
                col++;
            }
            else{
                row--;
            }

        }

        return count;




    }



}