public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode result = new ListNode(0);
	ListNode curr = result;
	int carry = 0;
	ListNode l1Head = l1;
	ListNode l2Head = l2;
	while(l1Head != null && l2Head != null) {
		int sum = l1Head.val + l2Head.val + carry;
		carry = sum / 10;
		ListNode added = new ListNode((sum % 10));
		curr.next = added;
		curr = curr.next;
		l1Head = l1Head.next;
		l2Head = l2Head.next;
	}
	if(l1Head == null && l2Head == null) {
		if(carry > 0) {
			curr.next = new ListNode(carry);
		}
		return result.next;
	}
	if(l1Head == null) {
		l1Head = l2Head;
	}
	curr.next = l1Head;
	ListNode prev = curr;
	curr = curr.next;
	while(curr != null && carry > 0) {
		int sum = curr.val + carry;
		curr.val = sum % 10;
		carry = sum / 10;
		prev = curr;
		curr = curr.next;
	}
	if(carry > 0) {
		prev.next = new ListNode(carry);
	}
	return result.next;
}