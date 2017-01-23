public List<Integer> postorderTraversal(TreeNode root) {
	List<Integer> solution = new ArrayList<Integer>();
	if(root == null) {
		return solution;
	}
	Stack<TreeNode> stack = new Stack<TreeNode>();
	Set<TreeNode> leftVisited = new HashSet<TreeNode>();
	Set<TreeNode> rightVisited = new HashSet<TreeNode>();
	stack.push(root);
	while(!stack.isEmpty()) {
		TreeNode node = stack.peek();
		if(node.left != null && !leftVisited.contains(node)) {
			stack.push(node.left);
			leftVisited.add(node);
		}
		else if(node.right != null && !rightVisited.contains(node)) {
			stack.push(node.right);
			rightVisited.add(node);
		}
		else {
			solution.add(stack.pop().val);
		}
	}
	return solution;
}