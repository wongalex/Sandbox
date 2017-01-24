int max = Integer.MIN_VALUE;
public int maxPathSum(TreeNode root) {
	if (root == null) {
		return 0;
	}
	maxPath(root);
	return max;
}

private int maxPath(TreeNode root) {
	if (root == null) {
		return 0;
	}
	int left = Math.max(0, maxPath(root.left));
	int right = Math.max(0, maxPath(root.right));
	max = Math.max(max, left + right + root.val);
	return Math.max(left, right) + root.val;
}