public class cPair {
	TreeNode node;
	int column;
	public cPair(TreeNode node, int column) {
		this.node = node;
		this.column = column;
	}
}
public List<List<Integer>> verticalOrder(TreeNode root) {
	List<List<Integer>> solution = new ArrayList<List<Integer>>();
	if (root == null) {
		return solution;
	}
	int minCol = Integer.MAX_VALUE;
	int maxCol = Integer.MIN_VALUE;
	Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
	Queue<cPair> nodes = new LinkedList<cPair>();
	nodes.offer(new cPair(root, 0));
	while (!nodes.isEmpty()) {
		cPair pair = nodes.poll();
		if (map.containsKey(pair.column)) {
			map.get(pair.column).add(pair.node.val);
		} else {
			List<Integer> list = new ArrayList<Integer>();
			list.add(pair.node.val);
			map.put(pair.column, list);
		}
		minCol = Math.min(minCol, pair.column);
		maxCol = Math.max(maxCol, pair.column);
		if (pair.node.left != null) {
			nodes.offer(new cPair(pair.node.left, pair.column - 1));
		}
		if (pair.node.right != null) {
			nodes.offer(new cPair(pair.node.right, pair.column + 1));
		}
	}
	for (int i = minCol; i <= maxCol; i++) {
		solution.add(map.get(i));
	}
	return solution;
}