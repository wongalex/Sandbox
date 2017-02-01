int count = 0;
public int pathSum(TreeNode root, int sum) {
	if (root == null) {
		return 0;
	}
	pathSum(root, sum, 0);
	pathSum(root.left, sum);
	pathSum(root.right, sum);
	return count;
}

private void pathSum(TreeNode root, int sum, int currSum) {
	if (root == null) {
		return;
	}
	currSum += root.val;
	if (currSum == sum) {
		count++;
	}
	pathSum(root.left, sum, currSum);
	pathSum(root.right, sum, currSum);
	return;
}