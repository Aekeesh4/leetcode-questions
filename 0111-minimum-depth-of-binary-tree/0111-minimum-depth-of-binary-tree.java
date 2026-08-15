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
    public int minDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        Queue <TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int depth=1;
        while(!queue.isEmpty())
        {
            int levelsize=queue.size();
            for(int i=0;i<levelsize;i++)
            {
                TreeNode currentnode=queue.poll();
                if(currentnode.left == null&&currentnode.right == null)
                {
                    return depth;
                }
                if(currentnode.left!=null)
                {
                    queue.offer(currentnode.left);
                }
                if(currentnode.right!=null)
                {
                    queue.offer(currentnode.right);
                }

            }
            depth++;
        }
         return depth;
    }
}