public String frequencySort(String s) {
	PriorityQueue<int[]> heap = new PriorityQueue<int[]>(new Comparator<int[]>() {
		@Override
		public int compare(int[] o1, int[] o2) {
			return o2[1] - o1[1];
		}
	});
	StringBuilder sb = new StringBuilder();
	int[] chars = new int[256];
	for(char c : s.toCharArray()) {
		chars[c]++;
	}
	for(int i = 0; i < chars.length; i++) {
		if(chars[i] > 0) {
			int[] charFrequency = {i, chars[i]};
			heap.offer(charFrequency);
		}
	}
	while(!heap.isEmpty()) {
		int[] charFrequency = heap.poll();
		int c = charFrequency[0];
		int frequency = charFrequency[1];
		for(int i = 0; i < frequency; i++) {
			sb.append((char)c);
		}
	}
	return sb.toString();
}