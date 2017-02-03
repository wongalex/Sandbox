public int minSubArrayLen(int s, int[] nums) {
	if (s == 0 || nums.length == 0) {
		return 0;
	}
	int start = 0;
	int end = 0;
	int sum = 0;
	int length = Integer.MAX_VALUE;
	
	while (end < nums.length) {
		sum += nums[end];
		while (sum >= s) {
			if (end - start + 1 < length) {
				length = end - start + 1;
			}
			sum -= nums[start];
			start++;
		}
		end++;
	}
	if (length == Integer.MAX_VALUE) {
		return 0;
	}
	return length;
}