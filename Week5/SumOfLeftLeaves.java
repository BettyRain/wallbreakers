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

    List<Integer> result = new ArrayList<Integer>();
    
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        addValues(root);
        for (int i=0; i<result.size(); i++){
            sum +=result.get(i);
        }
        return sum;
    }
    
    public void addValues(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            addValues(root.left);
        }
        if (root.left != null && root.left.left == null && root.left.right == null) {
            result.add(root.left.val);
        }
        if (root.right != null) {
            addValues(root.right);
        }
        return;
    }
}
