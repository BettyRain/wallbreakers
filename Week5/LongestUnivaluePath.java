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
    int max;
    public int longestUnivaluePath(TreeNode root) {
        max = 0;
        if (root == null) {
            return 0;
        }
        findMax(root);
        return max;
    }
    
    public int findMax(TreeNode root){
        if (root == null) {
            return 0;
        }
        
        int left = findMax(root.left);
        int right = findMax(root.right);
        
        if (root.left!= null) {
            if (root.left.val == root.val) {
                left = left+1;
            } else {
                left = 0;
            }
        }
        if (root.right!= null) {
            if (root.right.val == root.val) {
                right = right+1;
            } else {
                right = 0;
            }
        }
        
        max = Math.max(max, left+right);
       
        return Math.max(left, right);
    }
}