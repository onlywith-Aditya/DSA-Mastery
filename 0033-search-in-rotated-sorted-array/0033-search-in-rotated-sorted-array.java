class Solution {
    public int search(int[] nums, int target) {
        
        // It is also done using Binary Seach just little twist, we have to revers all condition.

        int  left = 0;
        int right = nums.length - 1;

        while(left <= right){

            int mid = left + (right - left) / 2;

            if(target == nums[mid]) return mid;
            
            //Left Half is sorted.
            if(nums[left] <= nums[mid]) {
                // Target in left half.
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }
                else{
                left = mid + 1;
                }
            }
            // Right half is sorted.
            else{
                // Target in right half.
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }
                else{
                right = mid - 1;
                }
            }


        
        }
    return -1;

    }
}