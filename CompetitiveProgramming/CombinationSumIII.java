List<List<Integer>> solution;
public List<List<Integer>> combinationSum3(int k, int n) {
	solution = new ArrayList<List<Integer>>();
	if (n < 1 || n > 45 || k < 1 || k > 9) {
		return solution;
	}
	combinationSum3(k, n, 0, new ArrayList<Integer>(), 1); 
	return solution;
}

private void combinationSum3(int k, int n, int sum, List<Integer> currSet, int index) {
	if (k == currSet.size()) {
		if(sum == n) {
			solution.add(new ArrayList<Integer>(currSet));
		}
		return;
	} else if (sum > n || currSet.size() > k) {
		return;
	} else {
		int currSum = sum;
		for (int i = index; i < 10; i++) {
			currSum += i;
			currSet.add(i);
			combinationSum3(k, n, currSum, currSet, i + 1);
			currSet.remove(currSet.size() - 1);
			currSum -= i;
		}
		return;
	}
}