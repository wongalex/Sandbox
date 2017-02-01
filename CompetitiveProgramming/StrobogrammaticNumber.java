public boolean isStrobogrammatic(String num) {
	List<Character> nonStrobNum = new ArrayList<Character>();
	nonStrobNum.add('2');
	nonStrobNum.add('3');
	nonStrobNum.add('4');
	nonStrobNum.add('5');
	nonStrobNum.add('7');
	for (int i = 0, j = num.length() - 1; i <= j; i++, j--) {
		for (char c : nonStrobNum) {
			if (num.charAt(i) == c || num.charAt(j) == c) {
				return false;
			}
		}
		if (num.charAt(i) == '6' || num.charAt(i) == '9') {
			if (num.charAt(i) == num.charAt(j)) {
				return false;
			} else {
				continue;
			}
		}
		if (num.charAt(i) != num.charAt(j)) {
			return false;
		}
	}
	return true;
}