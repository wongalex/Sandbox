ListNode head;
Random rNG;
/** @param head The linked list's head. Note that the head is guanranteed to be not null, so it contains at least one node. */
public Solution(ListNode head) {
	this.head = head;
	rNG = new Random();
}

/** Returns a random node's value. */
public int getRandom() {
	ListNode curr = head;
	int solution = -1;
	int random = 1;
	while (curr != null) {
		if (rNG.nextInt(random) == 0) {
			solution = curr.val;
		} 
		curr = curr.next;
		random++;
	}
	return solution;
}