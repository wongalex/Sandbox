public void connect(TreeLinkNode root) {
    if (root == null) {
        return;
    }
    Queue<TreeLinkNode> nodes = new LinkedList<TreeLinkNode>();
    Queue<Integer> levels = new LinkedList<Integer>();
    nodes.offer(root);
    levels.offer(0);
    while (!nodes.isEmpty()) {
        TreeLinkNode currNode = nodes.poll();
        int currLevel = levels.poll();
        if (currNode.left != null) {
            nodes.offer(currNode.left);
            levels.offer(currLevel + 1);
        }
        if (currNode.right != null) {
            nodes.offer(currNode.right);
            levels.offer(currLevel + 1);
        }
        if (!levels.isEmpty() && levels.peek() == currLevel) {
            currNode.next = nodes.peek();
        }
    }
    return;
}
