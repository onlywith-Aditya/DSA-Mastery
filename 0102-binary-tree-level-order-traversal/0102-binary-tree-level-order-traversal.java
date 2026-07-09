
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>(); // Create ArrayList "Result".

        if (root == null) {
            return result; //  If empty tree.
        }

        Queue<TreeNode> q = new LinkedList<>(); // Create Queue of LinkedList "q".
        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll(); // Insert top element to node.
                currentLevel.add(node.val); // Insert value of node to currentLevel.

                if (node.left != null) {
                    q.offer(node.left); // Insert left child to queue.
                }
                if (node.right != null) {
                    q.offer(node.right); // Insert right child to queue.
                }

            }

            result.add(currentLevel); // Add currentLevel elements to result.
        }

        return result;

    }
}