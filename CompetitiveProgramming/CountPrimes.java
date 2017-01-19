public int countPrimes(int n) {
	boolean[] isNotPrime = new boolean[n];
	int count = 0;
	for(int i = 2; i < n; i++) {
		if(isNotPrime[i] == false) {
			count++;
			for(int j = i; j < n; j += i) {
				isNotPrime[j] = true;
			}
		}
	}
	return count;
}