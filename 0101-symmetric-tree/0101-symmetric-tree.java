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
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        // Root case
        if(root == null){
            return false;
        }
        
        return isMirror(root.left, root.right);
    }
    private boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        boolean sameValue = left.val == right.val;

        boolean leftMirror = isMirror(left.left, right.right);

        boolean rightMirror = isMirror(left.right, right.left);

        return sameValue && leftMirror && rightMirror;
    }
 
}

