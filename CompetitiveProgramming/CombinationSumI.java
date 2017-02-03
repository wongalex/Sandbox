List<List<Integer>> solution;
public List<List<Integer>> combinationSum(int[] candidates, int target) {
	solution = new ArrayList<List<Integer>>();
	combinationSum(candidates, target, 0, new ArrayList<Integer>(), 0);
	return solution;
}

private void combinationSum(int[] candidates, int target, int sum, List<Integer> currSet, int index) {
	if (sum == target) {
		solution.add(new ArrayList<Integer>(currSet));
		return;
	} else if (sum > target) {
		return;
	} else {
		int currSum = sum;
		for (int i = index; i < candidates.length; i++) {
			currSet.add(candidates[i]);
			currSum += candidates[i];
			combinationSum(candidates, target, currSum, currSet, i);
			currSet.remove(currSet.size() - 1);
			currSum -= candidates[i];
		}
		return;
	}
}