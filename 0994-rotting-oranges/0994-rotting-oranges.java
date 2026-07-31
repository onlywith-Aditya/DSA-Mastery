class Solution {
    public int orangesRotting(int[][] grid) {

    int rows = grid.length;
    int cols = grid[0].length;
    
    Queue<int[]> queue = new LinkedList<>();
    int fresh = 0;
    int time = 0;

    // Find all rotten oranges and count fresh
    for(int  i = 0; i < rows; i++){
        for(int  j = 0; j < cols; j++)
        {
            if(grid[i][j] ==  2){
                // Save coordinates of rotten oranges.
                queue.offer(new int[]{i,j}); 
            }
            else if(grid[i][j] == 1){
                fresh ++;
            }
        }
    }

    // Edge case: no fresh oranges
    if(fresh == 0) return 0;

    // BFS Diretion toward make fresh to rotten.
    int[][] direction  =  {{1,0},{-1,0},{0,1},{0,-1}};

    //Make neighbour of rotten oranges rotten.
    while(!queue.isEmpty() && fresh > 0){
        int size = queue.size();
        time++;

        for(int  i = 0; i < size; i++){
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];

            // Check all 4 direction of rotten orange.
            for(int[] dir : direction){
                int newRow = row  + dir[0];
                int newCol = col + dir[1];
                if(newRow < rows && newRow >= 0 && newCol < cols && newCol>= 0 && grid[newRow][newCol] == 1){
                    
                    // Change fresh to rotten.
                    grid[newRow][newCol] = 2;
                    queue.offer(new int[]{newRow, newCol});
                    fresh--;


                }
            }
            
        }
    }
if(fresh > 0){
                return -1;
            }
            return time;


    }
}