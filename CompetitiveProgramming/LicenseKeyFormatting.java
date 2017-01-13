public String licenseKeyFormatting(String S, int K) {
	StringBuilder str = new StringBuilder();
	String upper = S.toUpperCase();
	for(char c : upper.toCharArray()) {
		if(c != '-') {
			str.append(c);
		}
	}
	if(str.length() <= K) {
		return str.toString();
	}
	for(int i = str.length() - K; i > 0; i -= K) {
		str.insert(i, '-');
	}
	return str.toString();
}