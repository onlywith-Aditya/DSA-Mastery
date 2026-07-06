import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.*;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        
           int n = profits.length;

           // 1. Create array of pair.(Caoutal, Profit)
            int[][] project = new int[n][2];

            for(int i=0;i<n;i++){
                project[i][0] = capital[i];
                project[i][1] = profits[i];
            }


            //  2. Sort by Capital
            Arrays.sort(project,(a,b)->a[0]-b[0]);

            // 3. Max Heap
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b-a); // Min

            // 4. Logic
            int idx = 0;
            for(int i  = 0;i<k;i++){
                // Add all affordable projects.
                while(idx<n && project[idx][0] <= w){
                    maxHeap.offer(project[idx][1]);
                    idx++;
                }

                // If no project available.
                if(maxHeap.isEmpty()){
                    return w;
                }
                w = w + maxHeap.poll();
            }

            return w;





    }
}