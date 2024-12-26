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
    int f=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        TreeNode head=root;
        tofind(head,sum,targetSum);
        if(f==1)
        return true;
        return false;
    }
    public void tofind(TreeNode root,int sum,int t){
        if(root==null){
            return;
        }
        sum+=root.val;
        if(root.left==null && root.right==null && sum==t){
        f=1;
        }
        tofind(root.left,sum,t);
        tofind(root.right,sum,t);
        
    }
}