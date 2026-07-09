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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;

        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> currentLevel = new ArrayList<>();
            
            for(int i=0;i<levelSize;i++){
                
                TreeNode node = q.poll();

                // If leftToRight, add  normally,else add to front.
                if(leftToRight) {
                    currentLevel.add(node.val);
                }    
                else{
                    currentLevel.add(0,node.val);   // Ad d at beginning.
                }

                //  Add child
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }

            }
            
        result.add(currentLevel);
        leftToRight  =  !leftToRight;
        }
    return result;



    }
}