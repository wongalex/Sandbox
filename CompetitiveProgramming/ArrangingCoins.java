public int arrangeCoins(int n) {
	if(n == 0) {
		return 0;
	}
	int count = 0;
	int sum = 0;
	while(n > 0 && n > count) {
		count++;
		n -= count;
	}
	return count;
}