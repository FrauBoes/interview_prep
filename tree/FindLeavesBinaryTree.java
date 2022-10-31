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
class FindLeavesBinaryTree {

    private List<List<Integer>> result;

    public List<List<Integer>> findLeaves(TreeNode root) {
        this.result = new ArrayList<>();

        getHeight(root);

        return this.result;
    }

    private int getHeight(TreeNode curr) {
        if (curr == null) {
            return -1;
        }

        int leftHeight = getHeight(curr.left);
        int rightHeight = getHeight(curr.right);

        int currHeight = Math.max(leftHeight, rightHeight) + 1;

        if (result.size() == currHeight) {
            result.add(new ArrayList<Integer>());
        }

        result.get(currHeight).add(curr.val);

        return currHeight;
    }
}