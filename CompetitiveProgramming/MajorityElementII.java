public List<Integer> majorityElement(int[] nums) {
	List<Integer> list = new ArrayList<Integer>();
	if (nums.length == 0) {
		return list;
	}
	int num1 = 0;
	int counter1 = 0;
	int num2 = 1;
	int counter2 = 0;
	for (int num : nums) {
		if(num == num1) {
			counter1++;
		} else if (num == num2) {
			counter2++;
		} else if (counter1 == 0) {
			num1 = num;
			counter1 = 1;
		} else if (counter2 == 0) {
			num2 = num;
			counter2 = 1;
		} else {
			counter1--;
			counter2--;
		}
		
	}
	counter1 = 0;
	counter2 = 0;
	for (int num : nums) {
		if (num1 == num) {
			counter1++;
		} else if (num2 == num) {
			counter2++;
		}
	}
	if (counter1 > nums.length / 3) {
		list.add(num1);
	}
	if (counter2 > nums.length / 3) {
		list.add(num2);
	}
	return list;
}