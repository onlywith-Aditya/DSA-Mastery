/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        // Monotonic, and we have to find first, we will use left as return.

        int left = 1;
        int right = n;

        while(left < right){
            
            int mid = left + (right - left) / 2;

            if(isBadVersion(mid)){
                right = mid;
            }
            else{
                // Mid is good and find right which is bad.
                left = mid + 1;
            }



        }

        return left;
    }
}