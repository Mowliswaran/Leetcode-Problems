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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<Integer>l1=new ArrayList<>();
        if(root==null){
            return l1;
        }
        int f=0;
        l1.add(root.val);
        q.add(root);
        while(!q.isEmpty()){
            f=0;
            int n=q.size();
            for(int i=0;i<n;i++){
            TreeNode t=q.poll();
            if(t!=null){
            if(t.right!=null){
                q.add(t.right);
                if(f==0)
                l1.add(t.right.val);
                f=1;
            }
            if(t.left!=null){
                q.add(t.left);
                if(f==0)
                l1.add(t.left.val);
                f=1;
            }}}
        }return l1;
    }
}