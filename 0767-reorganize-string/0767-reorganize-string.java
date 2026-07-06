import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public String reorganizeString(String s) {
        int n = s.length();
        // Step 1: Count frequencies
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Build a max-heap using a priority queue
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = 
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(freqMap.entrySet());

        // Step 3: Quick feasibility check
        if (maxHeap.peek().getValue() > (n + 1) / 2) {
            return "";
        }

        // Step 4: Construct the result
        StringBuilder result = new StringBuilder();
        Map.Entry<Character, Integer> prev = null;

        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> current = maxHeap.poll();
            result.append(current.getKey());
            current.setValue(current.getValue() - 1);

            // If the previous character still has a count, push it back
            if (prev != null && prev.getValue() > 0) {
                maxHeap.offer(prev);
            }
            prev = current;
        }

        // If the last character is still non-zero, something went wrong (should be caught by the check)
        if (prev != null && prev.getValue() > 0) {
            return "";
        }

        return result.toString();
    }
}