int maxDepth = 1;
public int depthSumInverse(List<NestedInteger> nestedList) {
	if (nestedList.size() == 0) {
		return 0;
	}
	int sum = 0;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	depthSumInverse(nestedList, 1, map);
	for(int num : map.keySet()) {
		sum += (map.get(num) * (maxDepth - num + 1));
	}
	return sum;
}

private void depthSumInverse(List<NestedInteger> nestedList, int depth, Map<Integer, Integer> map) {
	maxDepth = Math.max(maxDepth, depth);
	int sum = 0;
	for (NestedInteger num : nestedList) {
		if (num.isInteger()) {
			if (!map.containsKey(depth)) {
				map.put(depth, num.getInteger());
			}
			else {
				map.put(depth, map.get(depth) + num.getInteger());
			}
		} else {
			depthSumInverse(num.getList(), depth + 1, map);
		}
	}
	return;
}