int count;
public int findTargetSumWays(int[] nums, int S) {
	count = 0;
	if (nums.length == 0) {
		return count;
	}
	findTargetSumWays(nums, S, 0, 0);
	return count;
}

private void findTargetSumWays(int[] nums, int S, int sum, int index) {
	if (index == nums.length) {
		if (sum == S) {
			count++;
		}
		return;
	}
	int currSum = sum;
	findTargetSumWays(nums, S, currSum += nums[index], index + 1);
	currSum -= nums[index];
	findTargetSumWays(nums, S, currSum -= nums[index], index + 1);
	return;
}