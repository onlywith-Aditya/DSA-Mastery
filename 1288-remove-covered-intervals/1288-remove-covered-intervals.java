import java.util.*;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        // Sort by start ascending, and end descending
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];  // Larger end first if same start
            }
            return a[0] - b[0];  // Smaller start first
        });
        
        int count = 0;
        int maxEnd = 0;
        
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            
            if (end <= maxEnd) {
                // This interval is covered by a previous interval
                count++;
            } else {
                // This interval is NOT covered
                maxEnd = end;
            }
        }
        
        return intervals.length - count;
    }
}