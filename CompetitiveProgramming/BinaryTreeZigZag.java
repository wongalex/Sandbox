public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	List<List<Integer>> solution = new ArrayList<List<Integer>>();
	if (root == null) {
		return solution;
	}
	Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
	Queue<Integer> levelQueue = new LinkedList<Integer>();
	nodeQueue.offer(root);
	levelQueue.offer(0);
	while (!nodeQueue.isEmpty()) {
		TreeNode node = nodeQueue.poll();
		int level = levelQueue.poll();
		if (solution.size() <= level) {
			solution.add(new ArrayList<Integer>());
		}
		if (level % 2 == 1) {
			solution.get(level).add(0, node.val);
		} else {
			solution.get(level).add(node.val);
		}
		if (node.left != null) {
			nodeQueue.offer(node.left);
			levelQueue.offer(level + 1);
		}
		if (node.right != null) {
			nodeQueue.offer(node.right);
			levelQueue.offer(level + 1);
		}
	}
	return solution;
}