public List<Integer> rightSideView(TreeNode root) {
	List<Integer> solution = new ArrayList<Integer>();
	if(root == null) {
		return solution;
	}
	Queue<TreeNode> bfs = new LinkedList<TreeNode>();
	bfs.add(root);
	bfs.add(null);
	while(bfs.size() > 0) {
		TreeNode node = bfs.poll();
		if(node == null) {
			if(bfs.size() > 0) {
				bfs.add(null);
			}
			continue;
		}
		else {
			if(node.left != null) {
				bfs.add(node.left);
			}
			if(node.right != null) {
				bfs.add(node.right);
			}
			if(bfs.peek() == null) {
				solution.add(node.val);
			}
		}
	}
	return solution;
}