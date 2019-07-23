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
    List<Integer> result1 = new ArrayList<Integer>();
    List<Integer> result2 = new ArrayList<Integer>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        addValues(root1, result1);
        addValues(root2, result2);
        return result1.equals(result2);
    }
    
    public void addValues(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            result.add(root.val);
            return;
        } else {
            addValues(root.left, result);
            addValues(root.right, result);
        }
    }
}