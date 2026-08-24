// 1. Initialize dist[] = INF, dist[src] = 0
// 2. Repeat k+1 times:
//    a. Create a copy of dist (temp)
//    b. For each flight (u, v, w):
//       If dist[u] + w < temp[v]:
//          temp[v] = dist[u] + w
//    c. dist = temp
// 3. Return dist[dst] (or -1 if INF)

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // At most k stops-> k+1 edges
        for(int i = 0 ; i <= k ; i++){
            int[] temp = Arrays.copyOf(dist, n);

            for(int[] flight: flights){
                
                int u = flight[0];
                int v = flight[1];
                int w = flight[2];

                if(dist[u] != Integer.MAX_VALUE &&  dist[u] + w < temp[v]){
                    temp[v] = dist[u] + w;
                }
            }
            dist = temp;


        }

    return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];



        
    }
}