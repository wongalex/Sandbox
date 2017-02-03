public String minWindow(String s, String t) {
	if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
		return "";
	}
	int counter = t.length();
	int[] letters = new int[256];
	for (char c : t.toCharArray()) {
		letters[c]++;
	}
	int substringStart = 0;
	int start = 0;
	int end = 0;
	int length = Integer.MAX_VALUE;
	
	while (end < s.length()) {
		if (letters[s.charAt(end)] > 0) {
			counter--;
		}
		letters[s.charAt(end)]--;
		while (counter == 0) {
			if (end - start < length) {
				length = end - start;
				substringStart = start;
			}
			if (letters[s.charAt(start)] == 0) {
				counter++;
			}
			letters[s.charAt(start)]++;
			start++;
		}
		end++;
	}
	if (length == Integer.MAX_VALUE) {
		return "";
	}
	return s.substring(substringStart, substringStart + length + 1);
}