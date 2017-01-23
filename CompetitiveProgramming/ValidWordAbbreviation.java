public boolean validWordAbbreviation(String word, String abbr) {
	int i = 0, j = 0;
	while(i < word.length() && j < abbr.length()) {
		char c = abbr.charAt(j);
		if(c == '0') {
			return false; 
		}
		else if(c >= '1' && c <= '9') {
			int skip = c - '0';
			j++;
			while(j < abbr.length() && abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9') {
				skip = (skip * 10) + (abbr.charAt(j) - '0');
				j++;
			}
			i += skip;
			continue;
		}
		else {
			if(c != word.charAt(i)) {
				return false;
			}
			i++;
			j++;
		}
	}
	if(i == word.length() && j == abbr.length()) {
		return true;
	}
	return false;
}