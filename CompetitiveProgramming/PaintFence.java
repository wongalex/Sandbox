public int numWays(int n, int k) {
	if(n == 0) {
		return 0;
	}
	if(n == 1) {
		return k;
	}
	int[] fences = new int[n];
	fences[0] = k;
	fences[1] = k * k;
	for(int i = 2; i < n; i++) {
		fences[i] = ((k-1) * fences[i-2]) + ((k-1) * fences[i-1]);
	}
	return fences[n-1];
}