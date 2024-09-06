/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        rightSide(root, list, 0);

        return list;

    }

    public void rightSide(TreeNode root, ArrayList<Integer> list, int level) {
        if (root == null)
            return;

        if (level == list.size()) {
            list.add(root.val);
        }

        rightSide(root.right, list, level + 1);

        rightSide(root.left, list, level + 1);

    }
}