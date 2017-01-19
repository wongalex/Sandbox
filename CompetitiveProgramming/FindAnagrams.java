public List<Integer> findAnagrams(String s, String p) {
	if(p.length() > s.length()) {
		return new ArrayList<Integer>();
	}
	List<Integer> solution = new ArrayList<Integer>();
	int[] hash = new int[256];
	for(char c : p.toCharArray()) {
		hash[c]++;
	}
	int start = 0;
	int end = 0;
	int count = p.length();
	for(end = 0; end < p.length(); end++) {
		char c = s.charAt(end);
		if(hash[c] >= 1) {
			count--;
		}
		hash[c]--;
	}
	if(count == 0) {
		solution.add(start);
	}
	while(end < s.length()) {
		if(hash[s.charAt(start)] >=0) {
			count++;
		}
		hash[s.charAt(start)]++;
		start++;
		if(hash[s.charAt(end)] >= 1) {
			count--;
		}
		hash[s.charAt(end)]--;
		if(count == 0) {
			solution.add(start);
		}
		end++;
	}
	return solution;
}