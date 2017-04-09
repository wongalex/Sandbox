public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int valLeft = 0;
        int valRight = 0;
        if (root.left != null) {
            left = helper(root.left);
            valLeft = diameterOfBinaryTree(root.left);
        }
        if (root.right != null) {
            right = helper(root.right);
            valRight = diameterOfBinaryTree(root.right);
        }
        return Math.max(left + right, Math.max(valLeft, valRight));
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(helper(root.left), helper(root.right)) + 1;
}
