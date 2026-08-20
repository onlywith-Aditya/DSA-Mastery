class Solution {
    public int swimInWater(int[][] grid) {


        // Approach-> 1. [Binary Search and DFS]
            //  Also use visited track[][].
        
    //     int n = grid.length;
    //     int left = 0;
    //     int right = n*n-1; // Maximum possible elevation.

    //     while(left<right){
            
    //         int mid = left + (right - left) / 2;

    //         if(canSwim(grid, mid)){
    //             right = mid;    // Try to find smaller time.
    //         }
    //         else{
    //             left = mid + 1; // Need more time.
    //         }
    //     }  
    //     return left;
        
    // }

    // private boolean canSwim(int[][] grid, int time){ // Consider mid as a time.

    //     int  n = grid.length;

    //     // If start or end is not acccessible.
    //     if(grid[0][0] > time || grid[n-1][n-1] > time){
    //         return false;
    //     }

    //     boolean[][] visisted = new boolean[n][n];
    //     Queue<int[]> queue = new LinkesList<>();
    //     queue.offer(new int[] {0,0});
    //     visited[0][0] = true;

    //     int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

    //     while(!queue.isEmpty()){

    //         int[] curr = queue.poll();
    //         int row = curr[0];
    //         int col = curr[1];

    //         if(row == n-1 && col == n-1){
    //             return true;
    //         }

    //         for( int[] dir : dires){
    //             int newRow = row + dir[0];
    //             int newCol = col + dir[1];

    //             if(newRow >= 0 && newRow < n && newCol > 0 && newCol < n && !visited[newRow][newCol] && grid[newRow][newCol] <= time){

    //                 visited[newRow][newCol] = true;
    //                 queue.offer(new int[] {newRow, newCol});



    //             }
    //         }
    // return false;

    //     }



    // Approach-> 2. [Dijkstra's Algorith]
            // DS-> Min-Heap

            int  n = grid.length;

            // Min-Heap[elevation, row, col]
            PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);

            int[][] dist = new int[n][n]; // Taking n and n because size is in square, so we don't need 'm'.

            for( int[] row : dist){
                Arrays.fill(row, Integer.MAX_VALUE);
            }

            pq.offer(new int[] {grid[0][0],0,0});
            dist[0][0] = grid[0][0];

            int[][]dirs = {{1,0},{-1,0},{0,1},{0,-1}};

            while(!pq.isEmpty()){
                
                int[] curr = pq.poll();
                int elevation = curr[0];
                int row =curr[1];
                int col = curr[2];

                if(row == n-1 && col == n-1){
                    return elevation;
                }

                for( int[] dir : dirs){
                    
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    
                    if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < n){
                        
                        int newElevation = Math.max(elevation, grid[newRow][newCol]);

                        if(newElevation <dist[newRow][newCol]){
                            dist[newRow][newCol] =  newElevation;
                            pq.offer(new int[]{newElevation, newRow, newCol});
                        }


                    }



                }


            }

 
return dist[n-1][n-1];


    }
}