class InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode head = root;
        var queue = new ArrayDeque<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.remove();

            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }

        return head;
    }
}