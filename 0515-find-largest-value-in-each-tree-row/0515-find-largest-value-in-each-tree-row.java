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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelsize=queue.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<levelsize;i++)
            {
                TreeNode currentnode= queue.poll();
                max=Math.max(max,currentnode.val);
                if(currentnode.left!=null)
                {
                 queue.offer(currentnode.left);
                }
                if(currentnode.right!=null)
                {
                    queue.offer(currentnode.right);
                }
            }
            result.add(max);
        }
        return result;


        
    }
}