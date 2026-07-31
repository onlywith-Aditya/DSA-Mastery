class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        // All connected 1 become 2.
        // We can solve this using differen approach
            // 1. DFS with recursion.
            // 2. BFS
            // 3. DFS with directed graph.
        
        int originalColor = image[sr][sc];

        // Is same color, no changes need
        if(originalColor  == color){
            return image;
        }

        dfs(image, sr, sc, originalColor, color);
        return image;
    }

    //Function for DFS
    private void dfs(int[][] image, int row, int col, int originalColor, int newColor){

        // originalColor and newColor, consider them as coordinates.

        // Check in boundaries or out of oceans.
        if(row < 0 || row >= image.length || col < 0 || col >= image[0].length){
            return;
        }

        // Check if current cell has original color, mean visited.
        if(image[row][col] != originalColor){
            return;
        }
        // Change current cell to new color.
        image[row][col] = newColor;

        // Explore in 4 direction
        dfs(image, row + 1, col, originalColor, newColor);
        dfs(image, row - 1, col, originalColor, newColor);
        dfs(image, row, col + 1, originalColor, newColor);
        dfs(image, row, col - 1, originalColor, newColor);


    }




}