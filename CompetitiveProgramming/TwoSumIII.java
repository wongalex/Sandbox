List<Integer> list;
/** Initialize your data structure here. */
public TwoSum() {
	list = new ArrayList<Integer>();
}

/** Add the number to an internal data structure.. */
public void add(int number) {
	list.add(number);
}

/** Find if there exists any pair of numbers which sum is equal to the value. */
public boolean find(int value) {
	Collections.sort(list);
	if(list.size() < 2) {
		return false;
	}
	int i = 0, j = list.size() - 1;
	while(i < j) {
		int sum = list.get(i) + list.get(j);
		if(sum == value) {
			return true;
		}
		else if(sum < value) {
			i++;
		}
		else {
			j--;
		}
	}
	return false;
}