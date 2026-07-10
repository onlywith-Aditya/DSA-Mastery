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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        //  Check null or not.

            if(p == null && q == null){
                return true;
            }
            if(p == null || q == null){
                return false;
            }

        // Check root same or not

            if(p.val != q.val){
                return false;
            }

        // // Check length or tree.

        //     if(getSize(p) != getSize(q)){
        //         return false;
        //     }
        
        // Check left child

            boolean r1 = isSameTree(p.left, q.left);
            boolean r2 = isSameTree(p.right, q.right);

            if(r1 == true && r2 == true){
                return true;
            } 
    return false;
    }
}