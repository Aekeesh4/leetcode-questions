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

    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null)
        {
            return false;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
              TreeNode xparent=null;
        TreeNode yparent =null;
            int levelsize=queue.size();
            for(int i=0;i<levelsize;i++)
            {
                TreeNode currentnode=queue.poll();
                if(currentnode.left!=null)
                {
                    if(currentnode.left.val==x)
                    {
                        xparent=currentnode ;  
                    }    
                    if(currentnode.left.val==y)
                    {
                        yparent=currentnode;
                    }
                    queue.offer(currentnode.left);
                }
                if(currentnode.right!=null)
                {
                    if(currentnode.right.val==x)
                    {
                        xparent=currentnode;
                    }
                    if(currentnode.right.val==y)
                    {
                        yparent=currentnode;
                    }
                    queue.offer(currentnode.right);
                }
            }
            if(xparent!=null && yparent!=null)
            {
                return xparent!=yparent;
            }

        }
        return false;

    }
}