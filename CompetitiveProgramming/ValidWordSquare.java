public boolean validWordSquare(List<String> words) {
	if(words.size() == 0) {
		return true;
	}
	for(int i = 0; i < words.size(); i++) {
		if(words.get(i).length() > words.size()) {
			return false;
		}
		for(int j = 0; j < words.get(i).length(); j++) {
			if(words.get(j).length() <= i || words.get(i).charAt(j) != words.get(j).charAt(i)) {
				return false;
			}
		}
	}
	return true;
}