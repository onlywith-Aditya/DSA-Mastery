class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        int  n = grid.length;
        
        // Edge Cases
        if(n == 0 || grid[0][0] == 1 || grid[n-1][n-1] == 1){
            return -1;
        }
        
        if(n==1){
            return 1;
        }

        // 8 Direction-> Up, Down, Left, Right, Diagonals
        int[][] dir = {
            {1,0},{-1,0}, {0,1}, {0,-1},
            {1,1},{1,-1},{-1,1}, {-1,-1}
        };

        // BFS
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];

        queue.offer(new int[]{0,0,1}); // Row, Col, Distance
        visited[0][0] = true;

        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];
            int dist = curr[2]; 
        

        // Check if we reached destination
        if(row == n-1 && col == n-1){
            return dist;
        }

        // Explore all 8 direction
        for(int[] dire : dir){
            int newRow = row + dire[0];
            int newCol = col + dire[1];

            // Check  bounds, value and visited.
            if(newRow >= 0 && newRow < n && newCol >= 0 && newCol <n &&  grid[newRow][newCol] == 0 && !visited[newRow][newCol]){
                visited[newRow][newCol] = true;
                queue.offer(new int[]{newRow, newCol, dist+1});
            }
        }
        }
    return -1;
    
    }
}