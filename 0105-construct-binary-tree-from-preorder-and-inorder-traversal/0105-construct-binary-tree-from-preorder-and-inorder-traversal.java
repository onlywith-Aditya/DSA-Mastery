class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1, 
                     inorder, 0, inorder.length - 1);
    }
    
    private TreeNode build(int[] preorder, int preStart, int preEnd,
                           int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        
        // Root is the first element of preorder
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        
        // Find root's position in inorder
        int rootIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        
        // Calculate left subtree size
        int leftSize = rootIndex - inStart;
        
        // Build left subtree
        root.left = build(preorder, preStart + 1, preStart + leftSize,
                         inorder, inStart, rootIndex - 1);
        
        // Build right subtree
        root.right = build(preorder, preStart + leftSize + 1, preEnd,
                          inorder, rootIndex + 1, inEnd);
        
        return root;
    }
}