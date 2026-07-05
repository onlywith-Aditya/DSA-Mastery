import java.util.Collections;
import java.util.Arrays;


class Solution {
    public int findKthLargest(int[] nums, int k) {
        // 1st-Way=> Sorting (O(nlogn))

            Arrays.sort(nums);
            return nums[nums.length - k];

        // Heap=> Min Heap O(n log k)

            // PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            //         // Add last k element in heap.

            // for(int i = 0 ; i < nums.length;i++){
                    
            //         // Add current element to heap.

            //     minHeap.offer(nums[i]);

            //         // If heap size exceed k, remove the smallest element.

            //     if(minHeap.size() > k){
            //         minHeap.poll();
            //     }



            // } 
            // return minHeap.peek();


        // MaxHeap

//             PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

//                 // Add all things to Heap.
            
//             for(int  i = 0;i<nums.length;i++){
//                 maxHeap.offer(nums[i]);
//             }
//                 // Normal for loop to remove k-1 all element.
//             for(int i = 0;i<k-1;i++){
//                 maxHeap.poll();
//             }

//             return maxHeap.peek();       
    }
}
