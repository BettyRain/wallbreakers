/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null){
            return true;
        } else if (p==null || q==null){
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        boolean leftEquality = isSameTree(p.left, q.left);
        boolean rigthEquality = isSameTree(p.right, q.right);
        return leftEquality&&rigthEquality;
    }
}