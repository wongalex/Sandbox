public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	if(root == null || root == p || root == q) {
		return root;
	}
	TreeNode leftSide = lowestCommonAncestor(root.left, p, q);
	TreeNode rightSide = lowestCommonAncestor(root.right, p, q);
	if(leftSide != null && rightSide != null) {
		return root;
	}
	else if(leftSide != null) {
		return leftSide;
	}
	else if(rightSide != null) {
		return rightSide;
	}
	else {
		return null;
	}
	
}