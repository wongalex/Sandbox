public List<List<String>> groupStrings(String[] strings) {
	if(strings.length == 0) {
		return new ArrayList<List<String>>();
	}
	Map<String, List<String>> hash = new HashMap<String, List<String>>();
	for(String s : strings) {
		int offset = s.charAt(0) - 'a';
		StringBuilder sb = new StringBuilder();
		if(s.length() == 1) {
			sb.append("0");
		}
		for(int i = 0; i < s.length(); i++) {
			char c = (char) (s.charAt(i) - offset);
			if(c < 'a') {
				c += 26;
			}
			sb.append(c);
		}
		String key = sb.toString();
		if(hash.containsKey(key)) {
			List<String> list = hash.get(key);
			list.add(s);
			hash.put(key, list);
		}
		else {
			List<String> list = new ArrayList<String>();
			list.add(s);
			hash.put(key, list);
		}
	}
	return new ArrayList<List<String>>(hash.values());
	
}