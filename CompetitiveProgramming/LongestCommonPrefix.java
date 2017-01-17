public String longestCommonPrefix(String[] strs) {
	if(strs.length == 0) {
		return "";
	}
	Arrays.sort(strs);
	char[] first = strs[0].toCharArray();
	char[] last = strs[strs.length - 1].toCharArray();
	StringBuilder solution = new StringBuilder();
	for(int i = 0; i < Math.min(first.length, last.length); i++) {
		if(first[i] != last[i]) {
			return solution.toString();
		}
		solution.append(first[i]);
	}
	return solution.toString();
}