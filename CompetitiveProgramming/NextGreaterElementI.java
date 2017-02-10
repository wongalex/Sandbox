public int[] nextGreaterElement(int[] findNums, int[] nums) {
	if (findNums.length == 0 || nums.length == 0) {
		return new int[0];
	}
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	for (int i = 0; i < nums.length; i++) {
		map.put(nums[i], i);
	}
	int[] solution = new int[findNums.length];
	for (int i = 0; i < findNums.length; i++) {
		int greater = -1;
		for (int j = map.get(findNums[i]) + 1; j < nums.length; j++) {
			if (nums[j] > findNums[i]) {
				greater = nums[j];
				break;
			}
		}
		solution[i] = greater;
	}
	return solution;
}