public int findMaxConsecutiveOnes(int[] nums) {
	int maxCount = 0;
	int flipCount = 0;
	int currentCount = 0;
	for(int i = 0; i < nums.length; i++) {
		if(nums[i] == 1) {
			currentCount++;
			flipCount++;
		}
		else {
			maxCount = Math.max(maxCount, flipCount);
			flipCount = currentCount + 1;
			currentCount = 0;
		}
	}
	maxCount = Math.max(maxCount, Math.max(flipCount, currentCount));
	return maxCount;
}