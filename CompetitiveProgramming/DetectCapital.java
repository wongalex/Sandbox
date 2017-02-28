public boolean detectCapitalUse(String word) {
	if (word.length() < 2) {
		return true;
	}
	if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
		if (word.charAt(1) >= 'A' && word.charAt(1) <= 'Z') {
			return upperCase(word.substring(2, word.length()));
		} else {
			return lowerCase(word.substring(1, word.length()));
		}
	} else {
		return lowerCase(word.substring(1, word.length()));
	}
}

private boolean upperCase(String word) {
	if (word.length() == 0) {
		return true;
	}
	for (char c: word.toCharArray()) {
		if (c < 'A' || c > 'Z') {
			return false;
		}
	}
	return true;
}

private boolean lowerCase(String word) {
	if (word.length() == 0) {
		return false;
	}
	for (char c : word.toCharArray()) {
		if (c < 'a' || c > 'z') {
			return false;
		}
	}
	return true;
}