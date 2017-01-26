public boolean canJump(int[] nums) {
	if(nums.length == 0) {
		return false;
	}
	int maxJump = nums[0];
	for (int i = 1; i < nums.length; i++) {
		if (i > maxJump) {
			return false;
		}
		if (maxJump >= nums.length - 1) {
			return true;
		}
		maxJump = Math.max(maxJump, i + nums[i]);
	}
	return true;
}