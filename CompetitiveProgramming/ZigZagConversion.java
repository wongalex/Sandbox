public String convert(String s, int numRows) {
	if (s.length() < 2 || numRows < 2) {
		return s;
	}
	List<StringBuilder> rows = new ArrayList<StringBuilder>();
	for (int i = 0; i < numRows; i++) {
		rows.add(new StringBuilder());
	}
	boolean increment = true;
	int index = 0;
	for (char c : s.toCharArray()) {
		rows.get(index).append(c);
		if (index == 0) {
			increment = true;
			index++;
		} else if (index == numRows - 1) {
			increment = false;
			index--;
		} else if (increment == true) {
			index++;
		} else {
			index--;
		}
	}
	StringBuilder sb = new StringBuilder();
	for(StringBuilder subSb : rows) {
		sb.append(subSb.toString());
	}
	return sb.toString();
}