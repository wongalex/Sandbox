public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
	if (k == 0 || Profits.length == 0) {
		return W;
	}
	PriorityQueue<int[]> heap = new PriorityQueue<int[]>(new Comparator<int[]>() {
		@Override
		public int compare(int[] o1, int[] o2) {
			if (o2[0] == o1[0]) {
				return o1[1] - o2[1];
			}
			return o2[0] - o1[0];
		}
	});
	Queue<int[]> putBack = new LinkedList<int[]>();
	for (int i = 0; i < Profits.length; i++) {
		heap.offer(new int[]{Profits[i], Capital[i]});
	}
	for (int i = 0; i < k; i++) {
		boolean added = false;
		while (!heap.isEmpty()) {
			if (W >= heap.peek()[1]) {
				W += heap.poll()[0];
				added = true;
				break;
			} else {
				putBack.offer(heap.poll());
			}
		}
		if (!added) {
			break;
		}
		while (!putBack.isEmpty()) {
			heap.offer(putBack.poll());
		}
	}
	return W;
}