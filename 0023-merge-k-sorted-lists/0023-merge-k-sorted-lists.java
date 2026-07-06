import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Edge case: empty input
        if (lists == null || lists.length == 0) {
            return null;
        }
        
        // Min-Heap: ordered by node value
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );
        
        // Add head of each non-empty list to heap
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }
        
        // Dummy node for result
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        // Process heap
        while (!minHeap.isEmpty()) {
            // Get smallest node
            ListNode smallest = minHeap.poll();
            current.next = smallest;
            current = current.next;
            
            // Add next node from same list (if exists)
            if (smallest.next != null) {
                minHeap.offer(smallest.next);
            }
        }
        
        return dummy.next;
    }
}