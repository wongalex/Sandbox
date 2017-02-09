public String[] findWords(String[] words) {
	if (words.length == 0) {
		return new String[0];
	}
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	map.put('q', 1);
	map.put('w', 1);
	map.put('e', 1);
	map.put('r', 1);
	map.put('t', 1);
	map.put('y', 1);
	map.put('u', 1);
	map.put('i', 1);
	map.put('o', 1);
	map.put('p', 1);
	map.put('a', 2);
	map.put('s', 2);
	map.put('d', 2);
	map.put('f', 2);
	map.put('g', 2);
	map.put('h', 2);
	map.put('j', 2);
	map.put('k', 2);
	map.put('l', 2);
	map.put('z', 3);
	map.put('x', 3);
	map.put('c', 3);
	map.put('v', 3);
	map.put('b', 3);
	map.put('n', 3);
	map.put('m', 3);
	List<String> list = new ArrayList<String>();
	for (String str : words) {
		boolean sameRow = true;
		String lowStr = str.toLowerCase();
		int row = map.get(lowStr.charAt(0));
		for (char c : lowStr.toCharArray()) {
			if (map.get(c) != row) {
				sameRow = false;
				break;
			}
		}
		if (sameRow) {
			list.add(str);
		}
	}
	String[] solution = new String[list.size()];
	for (int i = 0; i < list.size(); i++) {
		solution[i] = list.get(i);
	}
	return solution;
}