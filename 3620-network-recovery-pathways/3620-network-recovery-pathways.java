import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n = online.length;

        // Build adjacency list for the graph
        List<List<int[]>> graph = new ArrayList<>();
        List<List<Integer>> dag = new ArrayList<>(); // For topological sort
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            dag.add(new ArrayList<>());
        }

        // Build the graph and track the maximum edge cost for binary search bounds
        int maxCost = 0;
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], cost = edge[2];
            graph.get(u).add(new int[]{v, cost});
            dag.get(u).add(v);
            maxCost = Math.max(maxCost, cost);
        }

        // Step 1: Perform topological sort (graph is a DAG as per constraints)
        List<Integer> topoOrder = topologicalSort(n, dag);

        // Step 2: Check if there is any valid path at all (score = 0)
        if (!canAchieveScore(0, n, graph, topoOrder, online, k)) {
            return -1;
        }

        // Step 3: Binary search on the path score (minimum edge cost)
        int low = 0, high = maxCost;
        int answer = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canAchieveScore(mid, n, graph, topoOrder, online, k)) {
                answer = mid;
                low = mid + 1; // Try to find a higher score
            } else {
                high = mid - 1;
            }
        }

        return answer;
    }

    // Kahn's algorithm for topological sorting
    private List<Integer> topologicalSort(int n, List<List<Integer>> dag) {
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            for (int v : dag.get(i)) {
                indegree[v]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> topoOrder = new ArrayList<>();
        while (!queue.isEmpty()) {
            int u = queue.poll();
            topoOrder.add(u);

            for (int v : dag.get(u)) {
                indegree[v]--;
                if (indegree[v] == 0) {
                    queue.offer(v);
                }
            }
        }

        return topoOrder;
    }

    // Feasibility check for a given score threshold
    private boolean canAchieveScore(int score, int n, List<List<int[]>> graph,
                                    List<Integer> topoOrder, boolean[] online, long k) {
        final long INF = Long.MAX_VALUE / 2;
        long[] dist = new long[n];
        Arrays.fill(dist, INF);
        dist[0] = 0;

        // Process nodes in topological order to find the shortest path
        // using only edges with cost >= score and going only to online nodes[citation:2][citation:4]
        for (int u : topoOrder) {
            if (dist[u] == INF) continue;

            for (int[] edge : graph.get(u)) {
                int v = edge[0];
                int cost = edge[1];

                // Filter: edge cost must be at least the score[citation:2][citation:12]
                if (cost < score) continue;

                // Filter: intermediate nodes must be online[citation:3][citation:4]
                if (v != n - 1 && !online[v]) continue;

                long newDist = dist[u] + cost;
                if (newDist < dist[v]) {
                    dist[v] = newDist;
                }
            }
        }

        return dist[n - 1] <= k;
    }
}