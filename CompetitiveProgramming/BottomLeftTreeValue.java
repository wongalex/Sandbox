int num = 0;
int level = -1;
public int findBottomLeftValue(TreeNode root) {
	Deque<TreeNode> nodes = new ArrayDeque<TreeNode>();
	Deque<Integer> levels = new ArrayDeque<Integer>();
	nodes.addLast(root);
	levels.addLast(0);
	while (!nodes.isEmpty()) {
		TreeNode curr = nodes.pollFirst();
		int nodeLevel = levels.pollFirst();
		if (nodeLevel != level) {
			num = curr.val;
			level = nodeLevel;
		}
		if (curr.left != null) {
			nodes.offerLast(curr.left);
			levels.offerLast(nodeLevel + 1);
		}
		if (curr.right != null) {
			nodes.offerLast(curr.right);
			levels.offerLast(nodeLevel + 1);
		}
	}
	return num;
}