public int sumNumbers(TreeNode root) {
	if(root == null) {
		return 0;
	}
	List<Integer> nums = new ArrayList<Integer>();
	return sumNumbers(root, 0);
	
}
private int sumNumbers(TreeNode root, int num) {
	if(root == null) {
		return 0;
	}
	if(isLeaf(root)) {
		return (num * 10) + root.val;
	}
	return sumNumbers(root.left, (num * 10) + root.val) + sumNumbers(root.right, (num * 10) + root.val);
}

private boolean isLeaf(TreeNode root) {
	if(root.left == null && root.right == null) {
		return true;
	}
	return false;
}