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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int level=1;
        int answerlevel=1;
        int maxsum=Integer.MIN_VALUE;
        while(!queue.isEmpty())
        {
            int levelsize=queue.size();
            int levelsum=0;
            for(int i=0;i<levelsize;i++)
            {
                TreeNode currentNode=queue.poll();
                levelsum+=currentNode.val;
                if(currentNode.left!=null)
                {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                  queue.offer(currentNode.right);
                }
            }
                if(levelsum>maxsum)
                {
                    maxsum=levelsum;
                    answerlevel=level;
                }
                 level++;
        }
        return answerlevel;

    }
}