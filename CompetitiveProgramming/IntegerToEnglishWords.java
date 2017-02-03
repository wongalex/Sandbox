public String numberToWords(int num) {
	if (num == 0) {
		return "Zero";
	}
	Map<Integer, String> map = new HashMap<Integer, String>();
	map.put(1, "One");
	map.put(2, "Two");
	map.put(3, "Three");
	map.put(4, "Four");
	map.put(5, "Five");
	map.put(6, "Six");
	map.put(7, "Seven");
	map.put(8, "Eight");
	map.put(9, "Nine");
	map.put(10, "Ten");
	map.put(11, "Eleven");
	map.put(12, "Twelve");
	map.put(13, "Thirteen");
	map.put(14, "Fourteen");
	map.put(15, "Fifteen");
	map.put(16, "Sixteen");
	map.put(17, "Seventeen");
	map.put(18, "Eighteen");
	map.put(19, "Nineteen");
	map.put(20, "Twenty");
	map.put(30, "Thirty");
	map.put(40, "Forty");
	map.put(50, "Fifty");
	map.put(60, "Sixty");
	map.put(70, "Seventy");
	map.put(80, "Eighty");
	map.put(90, "Ninety");
	
	int billions = (num / 1000000000) % 1000;
	int millions = (num / 1000000) % 1000;
	int thousands = (num / 1000) % 1000;
	int ones = num % 1000;
	
	StringBuilder sb = new StringBuilder();
	if (billions > 0) {
		numberToWords(billions, map, sb);
		sb.append("Billion ");
	}
	if (millions > 0) {
		numberToWords(millions, map, sb);
		sb.append("Million ");
	}
	if (thousands > 0) {
		numberToWords(thousands, map, sb);
		sb.append("Thousand ");
	}
	if (ones > 0) {
		numberToWords(ones, map, sb);
	}
	sb.setLength(sb.length() - 1);
	return sb.toString();
}

private void numberToWords(int num, Map<Integer, String> map, StringBuilder sb) {
	int hundreds = (num / 100) % 10;
	int tens = (num / 10) % 10;
	int ones = num % 10;
	if (hundreds > 0) {
		sb.append(map.get(hundreds));
		sb.append(" Hundred ");
	}
	if (tens > 0) {
		if(tens == 1) {
			sb.append(map.get((tens * 10) + ones));
			sb.append(" ");
			return;
		} else {
			sb.append(map.get(tens * 10));
			sb.append(" ");
		}
	}
	if (ones > 0) {
		sb.append(map.get(ones));
		sb.append(" ");
	}
	return;
}