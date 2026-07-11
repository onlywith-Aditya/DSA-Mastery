class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        // Build adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        boolean[] visited = new boolean[n];
        int completeCount = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> nodes = new ArrayList<>();
                int edgeCount = dfs(graph, visited, i, nodes);
                
                int nodeCount = nodes.size();
                int requiredEdges = nodeCount * (nodeCount - 1) / 2;
                
                if (edgeCount / 2 == requiredEdges) {
                    completeCount++;
                }
            }
        }
        
        return completeCount;
    }
    
    private int dfs(List<List<Integer>> graph, boolean[] visited, int node, List<Integer> nodes) {
        visited[node] = true;
        nodes.add(node);
        
        int edgeCount = 0;
        for (int neighbor : graph.get(node)) {
            edgeCount++; // Count each edge from this node
            if (!visited[neighbor]) {
                edgeCount += dfs(graph, visited, neighbor, nodes);
            }
        }
        return edgeCount;
    }
}