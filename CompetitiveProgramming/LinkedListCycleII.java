public ListNode detectCycle(ListNode head) {
	if (head == null || head.next == null) {
		return null;
	}
	ListNode slow = head;
	ListNode fast = head;
	boolean isCycle = false;
	
	while (fast != null && slow != null) {
		fast = fast.next;
		slow = slow.next;
		if(fast == null || fast.next == null) {
			return null;
		}
		fast = fast.next;
		if (slow == fast) {
			isCycle = true;
			break;
		}
	}
	if (!isCycle) {
		return null;
	}
	fast = head;
	while (slow != fast) {
		fast = fast.next;
		slow = slow.next;
	}
	return slow;
}