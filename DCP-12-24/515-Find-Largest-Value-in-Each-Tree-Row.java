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
    Queue<TreeNode>q=new LinkedList<>();
    public List<Integer> largestValues(TreeNode root) {
        q.add(root);
        List<Integer>li=new ArrayList<>();
        if(root==null){return li;
        }
        
        while(!q.isEmpty()){
            int n=q.size();
            int m=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                TreeNode t=q.poll();
                if(t!=null){
                m=Math.max(m,t.val);
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }}
            }
            li.add(m);
        }
        return li;
    }
}