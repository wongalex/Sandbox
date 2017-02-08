public List<Integer> largestDivisibleSubset(int[] nums) {
	if (nums.length == 0) {
		return new ArrayList<Integer>();
	}
	if (nums.length == 1) {
		List<Integer> solution = new ArrayList<Integer>();
		solution.add(nums[0]);
		return solution;
	}
	Arrays.sort(nums);
	Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
	boolean isOne = false;
	for (int num : nums) {
		if (num == 1) {
			isOne = true;
			continue;
		}
		boolean inserted = false;
		for (int key : map.keySet()) {
			if (num % key == 0) {
				map.get(key).add(num);
				map.put(num, map.get(key));
				map.remove(key);
				inserted = true;
				break;
			}
		}
		if (!inserted) {
			List<Integer> newList = new ArrayList<Integer>();
			newList.add(num);
			map.put(num, newList);
		}
	}
	int maxSize = 0;
	int mapKey = 0;
	for (int key : map.keySet()) {
		if (map.get(key).size() > maxSize) {
			maxSize = map.get(key).size();
			mapKey = key;
		}
	}
	List<Integer> solution = map.get(mapKey);
	if (isOne) {
		solution.add(0, 1);
	}
	return solution;
}