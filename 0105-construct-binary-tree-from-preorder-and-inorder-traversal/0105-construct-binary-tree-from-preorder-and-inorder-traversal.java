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
    int preindex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      return helper(preorder,inorder,0,inorder.length-1);
        
    }
    public TreeNode helper(int[] preorder,int[] inorder,int left,int right)
    {
        if(left>right)
        {
            return null;
        }
        int rootvalue =preorder[preindex];
        preindex++;
        TreeNode root=new TreeNode(rootvalue);
        int index=left;
        while(inorder[index]!=rootvalue)
        {
            index++;
        }
        root.left=helper(preorder,inorder,left,index-1);
        root.right=helper(preorder,inorder,index+1,right);

        return root;
    }
}