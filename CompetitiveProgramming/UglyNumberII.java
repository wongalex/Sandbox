public int nthUglyNumber(int n) {
    if (n < 1) {
        return 0;
    }
    PriorityQueue<Long> heap = new PriorityQueue<Long>();
    heap.offer((long)1);
    for(int i = 1; i < n; i++) {
        long uglyNum = heap.poll();
        while (!heap.isEmpty() && heap.peek() == uglyNum) {
            heap.poll();
        }
        heap.offer(uglyNum * 2);
        heap.offer(uglyNum * 3);
        heap.offer(uglyNum * 5);
    }
    return heap.poll().intValue();
}
