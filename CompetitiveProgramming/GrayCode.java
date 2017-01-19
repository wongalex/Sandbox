public List<Integer> grayCode(int n) {
	List<Integer> solution = new ArrayList<Integer>();
	for(int i = 0; i < (1 << n); i++) {
		solution.add((i >> 1) ^ i);
	}
	return solution;
	
}