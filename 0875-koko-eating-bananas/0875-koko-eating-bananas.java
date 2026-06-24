class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Find maximum pile (upper bound for binary search)
        int maxPile = 0;
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }
        
        // Binary search on speed
        int left = 1;
        int right = maxPile;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (canEatAll(piles, h, mid)) {
                right = mid;  // Try slower speed
            } else {
                left = mid + 1;  // Need faster speed
            }
        }
        
        return left;
    }
    
    private boolean canEatAll(int[] piles, int h, int speed) {
        int hours = 0;
        for (int pile : piles) {
            // Ceiling division: (pile + speed - 1) / speed
            hours += (pile + speed - 1) / speed;
            
            // Early exit: if hours exceed h, return false
            if (hours > h) {
                return false;
            }
        }
        return hours <= h;
    }
}