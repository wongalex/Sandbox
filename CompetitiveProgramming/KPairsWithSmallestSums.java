public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
	List<int[]> solution = new ArrayList<int[]>();
	PriorityQueue<int[]> heap = new PriorityQueue<int[]>(new Comparator<int[]>() {
		@Override
		public int compare(int[] o1, int[] o2) {
			return (o1[0] + o1[1]) - (o2[0] + o2[1]);
		}
	});
	for (int i = 0; i < nums1.length; i++) {
		for (int j = 0; j < nums2.length; j++) {
			heap.offer(new int[]{nums1[i], nums2[j]});
		}
	}
	while (!heap.isEmpty() && k > 0) {
		solution.add(heap.poll());
		k--;
	}
	return solution;
}