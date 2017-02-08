Queue<Integer> hits;
/** Initialize your data structure here. */
public HitCounter() {
	hits = new LinkedList<Integer>();
}

/** Record a hit.
	@param timestamp - The current timestamp (in seconds granularity). */
public void hit(int timestamp) {
	hits.offer(timestamp);
}

/** Return the number of hits in the past 5 minutes.
	@param timestamp - The current timestamp (in seconds granularity). */
public int getHits(int timestamp) {
	while (!hits.isEmpty() && timestamp - hits.peek() >= 300) {
		hits.poll();
	}
	return hits.size();
}