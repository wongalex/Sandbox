List<List<Integer>> solution;
public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	Arrays.sort(candidates);
	solution = new ArrayList<List<Integer>>();
	combinationSum2(candidates, target, 0, new ArrayList<Integer>(), 0);
	return solution;
}

private void combinationSum2(int[] candidates, int target, int sum, List<Integer> currSet, int index) {
	if (sum == target) {
		solution.add(new ArrayList<Integer>(currSet));
		return;
	} else if (sum > target) {
		return;
	} else {
		int currSum = sum;
		for (int i = index; i < candidates.length; i++) {
			if (i > index && candidates[i] == candidates[i - 1]) {
				continue;
			}
			currSum += candidates[i];
			currSet.add(candidates[i]);
			combinationSum2(candidates, target, currSum, currSet, i + 1);
			currSet.remove(currSet.size() - 1);
			currSum -= candidates[i];
		}
		return;
	}
}