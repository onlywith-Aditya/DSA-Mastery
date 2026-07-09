class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        // Array to store which component each node belongs to
        int[] component = new int[n];
        int currentComponent = 0;

        // First node always belongs to component 0
        component[0] = 0;

        // Traverse the sorted array and assign component IDs
        for (int i = 1; i < n; i++) {
            // If the gap between consecutive nodes is too large, start a new component
            if (nums[i] - nums[i - 1] > maxDiff) {
                currentComponent++;
            }
            component[i] = currentComponent;
        }

        // Answer each query in O(1) by comparing component IDs
        boolean[] ans = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];
            ans[i] = (component[u] == component[v]);
        }

        return ans;
    }
}