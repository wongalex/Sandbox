public int lengthOfLongestSubstring(String s) {
	String maxStr = "";
	StringBuilder currStr = new StringBuilder();
	Set<Character> currChar = new HashSet<Character>();
	for(char c : s.toCharArray()) {
		if(currChar.contains(c)) {
			if(currStr.length() > maxStr.length()) {
				maxStr = currStr.toString();
			}
			for(int i = 0; i < currStr.length(); i++) {
				if(currStr.charAt(i) == c) {
					currStr.delete(0, i+1);
					break;
				}
			}
		}
		currStr.append(c);
		currChar.add(c);
	}
	return Math.max(maxStr.length(), currStr.length());     
}