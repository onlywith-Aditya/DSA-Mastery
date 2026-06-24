class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int low = 0;
        int high = arr.length - 1;
        int peek = -1;

        while(low <= high){
        
            //  Mid
            int mid = low + (high - low) / 2;
            
            // Climb
            if(arr[mid] < arr[mid + 1]){
                low = mid + 1;
            }
            else{
                peek = mid;
                high = mid - 1;
            }
        }
        return peek;



    }
}