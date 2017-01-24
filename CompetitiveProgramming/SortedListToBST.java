public TreeNode sortedListToBST(ListNode head) {
	if (head == null) {
		return null;
	}
	if (head.next == null) {
		return new TreeNode(head.val);
	}
	int count = 0;
	ListNode curr = head;
	while (curr != null) {
		curr = curr.next;
		count++;
	}
	TreeNode root = sortedListToBST(head, 0, count - 1);
	return root;
}

private TreeNode sortedListToBST(ListNode head, int start, int end) {
	if (start > end) {
		return null;
	}
	if (start == end) {
		return new TreeNode(head.val);
	}
	ListNode curr = head;
	int index = (end - start) / 2 + start;
	int count = start;
	while (count != index) {
		curr = curr.next;
		count++;
	}
	TreeNode root = new TreeNode(curr.val);
	root.left = sortedListToBST(head, start, index - 1);
	root.right = sortedListToBST(curr.next, index + 1, end);
	return root;
}