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


//-----------------------------------------|


// class Solution {
//     public boolean findTarget(TreeNode root, int k) {
        
//         // Using In-order traversal.

//         if(root == null){
//             return false;
//         }
        
//         List<Integer> list = new ArrayList<>();
//         inorder(root,list);

//             // 2-pointer technique.
            
//             int left = 0;
//             int right = list.size()-1;
            
//             while(left < right){
//                 int sum = list.get(left) + list.get(right);
//                 if(sum == k){
//                     return true;
//                 }
//                 else if(sum < k){
//                     left++;
//                 }
//                 else{
//                     right--;
//                 }
//             }
//         return false;

//     }
//     private void inorder(TreeNode node, List<Integer> list){
//         if(node == null){
//             return;
//         }
//         inorder(node.left, list);
//         list.add(node.val);
//         inorder(node.right, list);
//     }
// }


//---------------------------------------|  S.T.A.C.K |
class Solution{
    public boolean findTarget(TreeNode root, int k){

        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();

        pushLeft(root, leftStack);
        pushRight(root, rightStack);
        
          
        TreeNode left = leftStack.peek();
        TreeNode right = rightStack.peek();
        

        while(left != right){
            int sum = left.val + right.val;

            if(sum == k){
                return true;
            }
            else if (sum < k){
                left = nextLeft(leftStack);
            }
            else{
                right =  nextRight(rightStack);
            }
        }
    return false;

    }
    
    private void pushLeft(TreeNode node, Stack<TreeNode> stack){
        while(node != null){
            stack.push(node);
            node = node.left;
        }
    }

    private void pushRight(TreeNode node, Stack<TreeNode> stack){
        while(node != null){
            stack.push(node);
            node = node.right;
        }
    }

    private TreeNode nextLeft(Stack<TreeNode> stack){
        TreeNode node =  stack.pop();
        pushLeft(node.right, stack);
        return stack.peek();
    }

    private TreeNode nextRight(Stack<TreeNode> stack) {
        TreeNode node = stack.pop();
        pushRight(node.left, stack);
        return stack.peek();
    }


}