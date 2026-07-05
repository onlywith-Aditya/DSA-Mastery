import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // 1. Count Frequency.
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }

        // 2. Create Min Heap
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a,b) -> a[1]-b[1] // Compare Frquency.
        );

        // 3. Process Each Entry
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int value = entry.getKey();
            int freq = entry.getValue();

            minHeap.offer(new int[]{value,freq});

            // If heap size exceeds k, remove the least frequent.
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        // 4. Extract rsults from heap.
        int[] result = new int[k];
        for(int  i = 0 ;i<k;i++){
            result[i] = minHeap.poll()[0];
        }
        return result;





    }
}