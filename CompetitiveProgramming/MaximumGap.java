public int maximumGap(int[] nums) {
	List<Integer> array = new ArrayList<Integer>();
	for (int num : nums) {
		array.add(num);
	}
	return maximumGap(array, 31);
}

private int maximumGap(List<Integer> nums, int i) {
	if (nums.size() <= 1 || i < 0) {
		return 0;
	}
	List<Integer> array1 = new ArrayList<Integer>();
	List<Integer> array0 = new ArrayList<Integer>();
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	for (int num : nums) {
		if (((num >>> i) & 1) == 1) {
			min = Math.min(min, num);
			array1.add(num);
		} else {
			max = Math.max(max, num);
			array0.add(num);
		}
	}
	int gap = Math.max(maximumGap(array1, i - 1), maximumGap(array0, i - 1));
	if (array1.size() > 0 && array0.size() > 0) {
		gap = Math.max(gap, min - max);
	}
	return gap;
}