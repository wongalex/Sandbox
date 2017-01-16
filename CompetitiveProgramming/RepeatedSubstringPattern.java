public boolean repeatedSubstringPattern(String str) {
	for(int i = 0; i < str.length()/2; i++) {
		if(str.length() % (i + 1) == 0 && i + 1 != str.length()) {
			String substr = str.substring(0, i + 1);
			boolean isPattern = true;
			for(int j = 0; j < str.length(); j += substr.length()) {
				String currSub = str.substring(j, j + substr.length());
				if(!substr.equals(currSub)) {
					isPattern = false;
				}
			}
			if(isPattern) {
				return true;
			}
		}
	}
	return false;
}