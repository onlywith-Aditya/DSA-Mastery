import java.util.*;

class Solution {
    int minScore = Integer.MAX_VALUE;
    List<List<int[]>> graph;
    boolean[] visited;
    
    public int minScore(int n, int[][] roads) {
        // Build graph
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] road : roads) {
            int u = road[0], v = road[1], w = road[2];
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }
        
        visited = new boolean[n + 1];
        dfs(1);
        return minScore;
    }
    
    private void dfs(int city) {
        visited[city] = true;
        
        for (int[] neighbor : graph.get(city)) {
            int nextCity = neighbor[0];
            int distance = neighbor[1];
            
            minScore = Math.min(minScore, distance);
            
            if (!visited[nextCity]) {
                dfs(nextCity);
            }
        }
    }
}