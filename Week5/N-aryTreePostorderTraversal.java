/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    
    List<Integer> result = new ArrayList<Integer>();

    public List<Integer> postorder(Node root) {
        if (root == null){
            return result;
        }
        addValues(root);
        return result;
    }
    
    public void addValues(Node root) {
        if (root.children == null) {
            result.add(root.val);
            return;
        } else {
            List<Node> children = root.children;
            for (Node temp : children) {
                addValues(temp);
            }
            result.add(root.val);
        }
    }
}