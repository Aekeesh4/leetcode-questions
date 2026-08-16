class Solution {
    public int maxDepth(TreeNode root) {
        // Base case: empty tree
        if (root == null) {
            return 0;
        }

        int leftheight = maxDepth(root.left);
        int rightheight = maxDepth(root.right);

       
        return Math.max(leftheight, rightheight) + 1;
    }
}