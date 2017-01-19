public int sumOfLeftLeaves(TreeNode root) {
	if(root == null || isLeaf(root)) {
		return 0;
	}
	int left = 0;
	if(isLeaf(root.left)) {
		left = root.left.val;
	}
	else {
		left = sumOfLeftLeaves(root.left);
	}
	int right = sumOfLeftLeaves(root.right);
	return left + right;
	
}
private boolean isLeaf(TreeNode root) {
	if(root == null) {
		return false;
	}
	if(root.left == null && root.right == null) {
		return true;
	}
	return false;
}