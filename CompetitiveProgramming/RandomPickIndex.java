public int[] nums;
public Random rNG;

public Solution(int[] nums) {
	this.nums = nums;
	rNG = new Random();
}

public int pick(int target) {
	int index = -1;
	int count = 0;
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == target) {
			count++;
			if (rNG.nextInt(count) == 0) {
				index = i;
			}
		}
	}
	return index;
}
}