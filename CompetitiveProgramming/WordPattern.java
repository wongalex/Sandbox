public boolean wordPattern(String pattern, String str) {
	String[] strings = str.split(" ");
	if(pattern.length() != strings.length) {
		return false;
	}
	Map<Character, String> map = new HashMap<Character, String>();
	for(int i = 0; i < strings.length; i++) {
		if(!map.containsKey(pattern.charAt(i))) {
			if(map.containsValue(strings[i])) {
				return false;
			}
			map.put(pattern.charAt(i), strings[i]);
		}
		else {
			if(!map.get(pattern.charAt(i)).equals(strings[i])) {
				return false;
			}
		}
	}
	return true;
}