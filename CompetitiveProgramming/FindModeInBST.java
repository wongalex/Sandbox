public int[] findMode(TreeNode root) {
	if (root == null) {
		return new int[0];
	}
	PriorityQueue<int[]> heap = new PriorityQueue<int[]>(new Comparator<int[]>() {
		@Override
		public int compare(int[] o1, int[] o2) {
			return o2[1] - o1[1];
		}
	});
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	findMode(root, map);
	for (int num : map.keySet()) {
		heap.add(new int[]{num, map.get(num)});
	}
	List<Integer> mode = new ArrayList<Integer>();
	int max = heap.peek()[1];
	while (!heap.isEmpty() && heap.peek()[1] == max) {
		mode.add(heap.poll()[0]);
	}
	int[] solution = new int[mode.size()];
	for(int i = 0; i < mode.size(); i++) {
		solution[i] = mode.get(i);
	}
	return solution;
}

private void findMode(TreeNode root, Map<Integer, Integer> map) {
	if (root == null) {
		return;
	}
	if (!map.containsKey(root.val)) {
		map.put(root.val, 1);
	} else {
		map.put(root.val, map.get(root.val) + 1);
	}
	findMode(root.left, map);
	findMode(root.right, map);
	return;
}