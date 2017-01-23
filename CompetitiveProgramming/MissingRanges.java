public List<String> findMissingRanges(int[] nums, int lower, int upper) {
	List<String> solution = new ArrayList<String>();
	StringBuilder sb = new StringBuilder();
	
	if(nums == null || nums.length == 0) {
		calculateRange(solution, sb, (long)lower - 1, (long)upper + 1);
		return solution;
	}
	calculateRange(solution, sb, (long)lower - 1, (long)nums[0]);
	for(int i = 1; i < nums.length; i++) {
		calculateRange(solution, sb, (long)nums[i-1], (long)nums[i]);
	}
	calculateRange(solution, sb, (long)nums[nums.length - 1], (long)upper + 1);
	return solution;
}

private void calculateRange(List<String> solution, StringBuilder sb, long start, long end) {
	sb.setLength(0);
	long difference = end - start;
	if(difference < 2) {
		return;
	}
	sb.append(String.valueOf(start + 1));
	if(difference > 2) {
		sb.append("->");
		sb.append(String.valueOf(end - 1));
	}
	solution.add(sb.toString());
	return;
}