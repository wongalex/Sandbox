public int countSegments(String s) {
	boolean segment = false;
	int index = 0;
	int count = 0;
	while(index < s.length() && s.charAt(index) == ' ') {
		index++;
	}
	while(index < s.length()) {
		if(s.charAt(index) != ' ') {
			segment = true;
			index++;
		}
		else { // char == ' '
			if(segment) {
				count++;
				segment = false;
			}
			index++;
		}
	}
	if(segment) {
		return count + 1;
	}
	return count;
}