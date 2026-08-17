class Solution {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        int[] color = new int[V]; 
        // Array fill with -1
        Arrays.fill(color,-1);

        // Loop till V and call DFS if uncolored.
        
        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                // Start DFS with color 0.
                if(!dfs(graph, i, 0, color)){
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean dfs(int[][] graph, int node, int colorToAssign,  int[] color) {

        color[node] = colorToAssign;

        // Check Neighbor
        for (int neighbor : graph[node]) {
            if (color[neighbor] == -1) {
                // Uncolored-> assign opposite coolor(1-colorToAssign)
                color[neighbor] = -color[node];
                if (!dfs(graph, neighbor, 1 - colorToAssign  ,color)) {
                    return false;
                }
            } else if (color[neighbor] == color[node]) {
                return false;
            }
        }
        return true;
    }
}