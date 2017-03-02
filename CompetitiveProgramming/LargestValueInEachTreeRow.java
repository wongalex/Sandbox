int maxVal = Integer.MIN_VALUE;
int level = 0;
public List<Integer> largestValues(TreeNode root) {
    List<Integer> solution = new ArrayList<Integer>();
    if (root == null) {
        return solution;
    }
    Deque<TreeNode> nodes = new ArrayDeque<TreeNode>();
    Deque<Integer> levels = new ArrayDeque<Integer>();
    nodes.offerLast(root);
    levels.offerLast(0);
    while(!nodes.isEmpty()) {
        TreeNode node = nodes.pollFirst();
        int currLevel = levels.pollFirst();
        if (currLevel == level) {
            maxVal = Math.max(maxVal, node.val);
        } else {
            solution.add(maxVal);
            level = currLevel;
            maxVal = node.val;
        }
        if (node.left != null) {
            nodes.offerLast(node.left);
            levels.offerLast(currLevel + 1);
        }
        if (node.right != null) {
            nodes.offerLast(node.right);
            levels.offerLast(currLevel + 1);
        }
    }
    solution.add(maxVal);
    return solution;
}
