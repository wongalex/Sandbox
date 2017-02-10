public int[] nextGreaterElements(int[] nums) {
	int n = nums.length;
	int[] solution = new int[n];
	if (n == 0) {
		return solution;
	}
	
	Deque<Integer> stack = new ArrayDeque<Integer>();
	for (int i = n - 1; i >= 0; i--) {
		stack.addFirst(i);
		solution[i] = -1;
	}
	for (int i = n - 1; i >= 0; i--) {
		while (!stack.isEmpty()) {
			if (nums[stack.peekFirst()] <= nums[i]) {
				stack.removeFirst();
			} else {
				solution[i] = nums[stack.peekFirst()];
				break;
			}
		}
		stack.addFirst(i);
	}
	return solution;
}