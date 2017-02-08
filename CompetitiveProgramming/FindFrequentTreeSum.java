Map<Integer, Integer> map;
int count;
public int[] findFrequentTreeSum(TreeNode root) {
	if (root == null) {
		return new int[0];
	}
	map = new HashMap<Integer, Integer>();
	count = 0;
	findFrequentTreeSumHelper(root);
	List<Integer> list = new ArrayList<Integer>();
	for (int key : map.keySet()) {
		if (map.get(key) == count) {
			list.add(key);
		}
	}
	int[] solution = new int[list.size()];
	for (int i = 0; i < list.size(); i++) {
		solution[i] = list.get(i);
	}
	return solution;
}

private int findFrequentTreeSumHelper(TreeNode root) {
	if (root == null) {
		return 0;
	}
	int left = findFrequentTreeSumHelper(root.left);
	int right = findFrequentTreeSumHelper(root.right);
	int sum = left + right + root.val;
	if (!map.containsKey(sum)) {
		map.put(sum, 1);
	} else {
		map.put(sum, map.get(sum) + 1);
	}
	count = Math.max(count, map.get(sum));
	return sum;
}