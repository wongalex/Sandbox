public List<List<Integer>> levelOrderBottom(TreeNode root) {
	List<List<Integer>> solution = new ArrayList<List<Integer>>();
	Queue<TreeNode> queue = new LinkedList<TreeNode>();
	if(root == null) {
		return solution;
	}
	queue.add(root);
	queue.add(null);
	List<Integer> list = new ArrayList<Integer>();
	while(!queue.isEmpty()) {
		TreeNode curr = queue.poll();
		if(curr == null) {
			solution.add(list);
			list = new ArrayList<Integer>();
			if(queue.isEmpty()) {
				break;
			}
			queue.add(null);
		}
		else {
			list.add(curr.val);
			if(curr.left != null) {
				queue.add(curr.left);
			}
			if(curr.right != null) {
				queue.add(curr.right);
			}
		}
	}
	Collections.reverse(solution);
	return solution;
}