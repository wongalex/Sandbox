public String[] findRelativeRanks(int[] nums) {
	String[] solution = new String[nums.length];
	if (nums.length == 0) {
		return solution;
	}
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	for (int i = 0; i < nums.length; i++) {
		map.put(nums[i], i);
	}
	PriorityQueue<Integer> heap = new PriorityQueue<Integer>(new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	});
	for (int num : nums) {
		heap.offer(num);
	}
	int rank = 1;
	while (!heap.isEmpty()) {
		int score = heap.poll();
		switch (rank) {
			case 1:
				solution[map.get(score)] = "Gold Medal";
				rank++;
				break;
			case 2:
				solution[map.get(score)] = "Silver Medal";
				rank++;
				break;
			case 3:
				solution[map.get(score)] = "Bronze Medal";
				rank++;
				break;
			default:
				solution[map.get(score)] = String.valueOf(rank);
				rank++;
				break;
		}
	}
	return solution;
}